package core;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Database {

    private static Database connector = null;
    private Connection connection;
    private static String URL = "jdbc:postgresql://localhost:5432/databases";
    private static String USERNAME = "postgres";
    private static String PASSWORD = "postgres";

    // The Database class facilitates connection with the database.
    // Section - 6 : A database was used in the project and the DB connector configuration was made correctly.
    private Database() {
        try {

            // Establishing connection with the database.
            this.connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Returns the database connection.
    private Connection getConnection() {
        return connection;
    }

    // Establishes connection and logs the connection status.
    public static Connection connector() {
        connector = new Database();
        return connector.getConnection();
        }
    }
