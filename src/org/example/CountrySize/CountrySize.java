/**
 * 
 */
package org.example.CountrySize;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.example.DAO.CountriesDAO;
import org.example.DAO.CountriesDAOImpl;
import org.example.DAO.TextWriterImpl;
import org.example.DBConnection.DBConnect;
import org.example.Entities.Country;
import org.example.Entities.FileProperties;

/**
 * This application will generate a report showing the 10 largest countries, and
 * the 10 smallest countries
 * 
 * @author Rostom Sahakian
 * @version 1.0 MORE WORK IS NEEDED
 * 
 */
public class CountrySize {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// *********************************************
		// A new Java Project ->done
		// An Application class -> Done
		// An Entity class to hold the data from the SQL query ->
		// An Action Interface listing the method(s) you need ->
		// An Action Implementation containing the DAO code ->
		// ****NEED TO WORK ON LOGS AND EXCEPTIONS****
		// ********************************************

		// read the properties file
		// Create DB2 connection (Singleton method)
		FileProperties fileprops = new FileProperties();
		// Create the connection with singleton
		Connection conn = DBConnect.getConnection(fileprops);
		// Establish connection to Database
		CountriesDAO countriesBySize = new CountriesDAOImpl(conn);
		// get data from database
		List<Country> countryData = countriesBySize.getCountriesBySize();
		// After data has been fetched pass it to the writer
		TextWriterImpl writer = new TextWriterImpl(fileprops.getOutputFile());
		// Declare list array variable to convert Country type to String array
		// type
		List<String> outputData = new ArrayList<String>();
		// We need the 1st ten for the largest countries
		// we need the last ten for the smallest countries
		int queryDataSize = countryData.size();
		int largest = 10; // index begins at zero
		int smallest = Math.abs(queryDataSize - 11); // index ends -1
		int i = 0;
		int j = 0;

		// Largest Countries text section
		String title = "Largest Countries:";
		outputData.add(countriesBySize.fileHeaders(title)[0]);
		outputData.add(countriesBySize.fileHeaders(title)[1]);
		outputData.add(countriesBySize.fileHeaders(title)[2]);
		outputData.add(countriesBySize.fileHeaders(title)[3]);
		// Loop one to get top 10 largest countries and then write them to file
		for (Country countrySizes : countryData) {

			if (i < largest) {
				// Calls the toString method in CountriesDAOImpl
				outputData.add(countrySizes.toString());
			}
			i++;
		}
		// Smallest Countries text section
		title = "Smallest Countries:";
		outputData.add(countriesBySize.fileHeaders(title)[0]);
		outputData.add(countriesBySize.fileHeaders(title)[1]);
		outputData.add(countriesBySize.fileHeaders(title)[2]);
		outputData.add(countriesBySize.fileHeaders(title)[3]);
		// Loop two to get top 10 smallest countries and then write to file
		for (Country countrySizes : countryData) {
			if (j > smallest) {
				// Calls the toString method in CountriesDAOImpl
				outputData.add(countrySizes.toString());
			}
			j++;
		}
		// write to file
		writer.writeLines(outputData);
		// close connection
		conn.close();
		// close writer
		writer.close();
	}

}
