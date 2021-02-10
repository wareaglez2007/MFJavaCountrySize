/**
 * 
 */
package org.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.example.Entities.Country;

/**
 * @author Rostom Sahakian
 * 02-09-2021
 *
 */
public class CountriesDAOImpl implements CountriesDAO {

	/**
	 * get the connection from main
	 * If I want to limit in DB2 ->SQL syntext  FETCH FIRST 10 ROWS ONLY
	 */
	String direction = "desc";
	private String sql = "SELECT city.Name AS cityName, country.Name As countryName, "
			+ "country.Population, country.SurfaceArea, "
			+ "country.Population / country.SurfaceArea as Density "
			+ "FROM jearl.Countries AS country "
			+ "INNER JOIN jearl.Cities AS city "
			+ "ON country.Capital = city.Id "
			+ "ORDER BY country.SurfaceArea desc";

	private Connection connect;
	private PreparedStatement pstmt = null;

	public CountriesDAOImpl(Connection conn) {
		// TODO Auto-generated constructor stub
		connect = conn;
		try {
			pstmt = connect.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//1st ten and last 10
	@Override
	public List<Country> getCountriesBySize() throws Exception {
		List<Country> results = new ArrayList<Country>();
		ResultSet rset = null;
		try {

			rset = pstmt.executeQuery();
			while (rset.next()) {
				try {

					results.add(buildCountries(rset));

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			rset.close();
		} catch (SQLException e) {
			// LOG.error(getError(e));
			throw e;
		}
		return results;

	}

	private Country buildCountries(ResultSet results) throws Exception {
		try {
			Country record = new Country();
			/*
			 * CREATE TABLE JEarl.Cities ( Id INT NOT NULL, Name VARCHAR(35) NOT
			 * NULL, CountryCode VARCHAR(3) NOT NULL, District VARCHAR(20) NOT
			 * NULL, Population INT NOT NULL, PRIMARY KEY (Id))
			 * 
			 * CREATE TABLE JEarl.Countries ( Code VARCHAR(3) NOT NULL, Name
			 * VARCHAR(52) NOT NULL, Continent VARCHAR(20) NOT NULL, Region
			 * VARCHAR(26) NOT NULL, SurfaceArea DECIMAL(10,2) NOT NULL,
			 * IndepYear INT, Population INT NOT NULL, LifeExpectancy
			 * DECIMAL(3,1), GNP DECIMAL(10,2), GNPOld DECIMAL(10,2), LocalName
			 * VARCHAR(45) NOT NULL, GovernmentForm CHAR(45) NOT NULL,
			 * HeadOfState VARCHAR(60), Capital INT, Code2 VARCHAR(2) NOT NULL,
			 * PRIMARY KEY (Code))
			 * 
			 * SELECT city.Name, country.Name, country.Population,
			 * country.SurfaceArea, country.Population / country.SurfaceArea as
			 * Density FROM jearl.Countries AS country INNER JOIN jearl.Cities
			 * AS city ON country.Capital = city.Id ORDER BY country.SurfaceArea
			 * desc
			 */
			// record.setCode(results.getString("Code"));

			// Capital City Name
			// Country Population
			// Country Size (Surface Area)
			// Country Density (Surface Area / Population)

			record.setName(results.getString("countryName"));
			record.setCityName(results.getString("cityName"));
			record.setSurfaceArea(results.getDouble("SurfaceArea"));
			record.setPopulation(results.getInt("Population"));
			record.setDensity(results.getDouble("Density"));
			
			

			return record;
		} catch (SQLException sqle) {
			// LOG.error(getError(sqle));
			throw sqle;
		}
	}
	
	public String[] fileHeaders(String title){

		String[] smallesttheader =

		{
				"\n",
				String.format("%30s\n", title),
				String.format("%-23s	%-34s	%13s	%14s   %12s\n", "CITY NAME",
						"COUNTRY NAME", "POPULATION", "SURFACE AREA", "DENSITY"),
				String.format("%-23s	%-30s	%13s  %14s  %12s\n",
						"-----------------------",
						"----------------------------------", "--------------",
						"------------", "---------") };
		
		return smallesttheader;
		
	}

}
