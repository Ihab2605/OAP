package com.transportSys.actiontable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.transportSys.connection.dbConnection;

public class AutoIncrementAction {

    public static int getNewCustomerNumber() {
        int newCustomerNumber = 1; // Default to 1 if no customers are present
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = dbConnection.getConnection(); // Assuming dbConnection is a class that provides the connection
            String sql = "SELECT MAX(customerNumber) as maxNumber FROM customers";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                newCustomerNumber = rs.getInt("maxNumber") + 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exception
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                // Handle exception
            }
        }
        return newCustomerNumber;
    }
}