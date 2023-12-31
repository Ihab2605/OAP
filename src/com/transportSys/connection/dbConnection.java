package com.transportSys.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * A utility class to manage database connections.
 */
public class dbConnection {
	/** The URL for the database connection. */
	public static final String URL = "jdbc:mysql://localhost:3306/classicmodels";
	/** The username for the database connection. */
	public static final String USERNAME = "student";
	/** The password for the database connection. */
	public static final String PASSWORD = "student";

	/**
	 * Default constructor for the dbConnection class
	 */
	public dbConnection() {
		// Empty constructor
		// Used to provide a default constructor
	}

	/**
	 * Establishes a connection to the database.
	 *
	 * @return A Connection object representing the database connection.
	 * @throws SQLException If a database access error occurs or the URL is null.
	 */
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}

	/**
	 * Retrieves the URL used for database connection.
	 *
	 * @return The URL for the database connection.
	 */
	public static String getURL() {
		return URL;
	}

	/**
	 * Retrieves the username used for database connection.
	 *
	 * @return The username for the database connection.
	 */
	public static String getUsername() {
		return USERNAME;
	}

	/**
	 * Retrieves the password used for database connection.
	 *
	 * @return The password for the database connection.
	 */
	public static String getPassword() {
		return PASSWORD;
	}

	/**
	 * Closes the database connection.
	 *
	 * @param connection The Connection object to be closed.
	 */
	public static void closeConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void closeResultSet(ResultSet resultSet) {
		// TODO Auto-generated method stub
		
	}

	public static void closeStatement(PreparedStatement pst) {
		// TODO Auto-generated method stub
		
	}
}
