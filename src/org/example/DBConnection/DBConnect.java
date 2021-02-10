/**
 * 
 */
package org.example.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.example.Entities.FileProperties;

import com.ibm.db2.jcc.DB2Connection;

/**
 * @author Administrator
 *
 */
public class DBConnect {

	/**
	 * This Class will handle the DB connection to DB2 Read in from
	 * Connection.prpperties file 1.Driver 2.URL 3.User 4.Password
	 */
	private static String driver;
	private static String URL;
	private static String User;
	private static String Password;
	private static Connection conn = null;
	private static final Logger LOG = Logger.getLogger(DBConnect.class);

	private DBConnect() throws Exception {			

	}

	/**
	 * @returns connection
	 */
	public static Connection getConnection(FileProperties data) throws Exception {
		try {
			driver = data.getDriver();
			URL = data.getUrl();
			User = data.getUser();
			Password = data.getPassword();
			
			conn = DriverManager.getConnection(URL, User, Password);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;

	}

	public void close() throws Exception {
		try {

			conn.close();
		} catch (SQLException e) {
			LOG.error(getError(e));
			throw e;
		}
	}

	private String getError(SQLException oops) {
		return "Failed to execute SQL," + " Error Code: " + oops.getErrorCode()
				+ " SQLState: " + oops.getSQLState() + " Message: "
				+ oops.getMessage();
	}

}
