package org.example.Entities;

/**
 * This program will read in the connection properties & output file information for the main application 
 * @author Rostom Sahakian
 * 02-09-2021
 * 
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileProperties {

	final static String CONFIGFILE = "connection.properties";
	private String driver;
	private String url;
	private String user;
	private String password;
	private String outputFile;
	private int cutoff;

	public FileProperties() {
		// Read properties "config.properties"
		Properties prop = null;
		try {
			prop = new Properties();
			InputStream input = new FileInputStream(CONFIGFILE);

			prop.load(input);
		} catch (IOException e) {
			System.err.println(e.getMessage());
			System.exit(4);
		}
		// input DB2 QUERY
		// DB2 Driver
		setDriver(prop.getProperty("driver"));
		// DB2 URL
		setUrl(prop.getProperty("url"));
		// DB2 User
		setUser(prop.getProperty("user"));
		// DB2 Password
		setPassword(prop.getProperty("password"));
		// Output file
		setOutputFile(prop.getProperty("output.file"));
		// Out put limit
		String cutoffValue = prop.getProperty("output.limit");
		setCutoff(Integer.parseInt(cutoffValue));
	}

	/**
	 * @return the driver
	 */
	public String getDriver() {
		return driver;
	}

	/**
	 * @param driver
	 *            the driver to set
	 */
	public void setDriver(String driver) {
		this.driver = driver;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *    the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the outputFile
	 */
	public String getOutputFile() {
		return outputFile;
	}

	/**
	 * @param outputFile
	 *            the outputFile to set
	 */
	public void setOutputFile(String outputFile) {
		this.outputFile = outputFile;
	}

	/**
	 * @return the cutoff
	 */
	public int getCutoff() {
		return cutoff;
	}

	/**
	 * @param cutoff
	 *            the cutoff to set
	 */
	public void setCutoff(int cutoff) {
		this.cutoff = cutoff;
	}

}
