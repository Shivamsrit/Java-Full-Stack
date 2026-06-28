package CH02JDBC;

import java.sql.*;

public class Insert {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Students?createDatabaseIfNotExist=true";
        String user = "root";
        String password = "Shivam9981@";

        Connection connection = null;

    //     1. Load Driver (optional in modern JDBC, but good practice)
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
            return;
        }

        // 2. Establish Connection
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database successfully!");
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }

        // 3. INSERT using PreparedStatement (SQL Injection safe ✅)
        String insertQuery = "INSERT INTO students (name, course_id, gender, phone, dob, address) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = connection.prepareStatement(insertQuery);

            // Set values for each placeholder (?)
            ps.setString(1, "Shivam Jaiswal");   // name
            ps.setInt(2, 3);                      // course_id
            ps.setString(3, "M");                 // gender
            ps.setLong(4, 9876543210L);           // phone
            ps.setDate(5, Date.valueOf("2002-05-15")); // dob
            ps.setString(6, "Noida, UP");         // address

            // 4. Execute INSERT
            int rowsAffected = ps.executeUpdate(); // returns count of inserted rows

            System.out.println("Rows inserted: " + rowsAffected);

        } catch (SQLException e) {
            System.out.println("Insert failed: " + e.getMessage());
        }
        String selectQuery = "SELECT * FROM students";
        try{
            PreparedStatement ps = connection.prepareStatement(selectQuery);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("ID       : " + rs.getInt("id"));
                System.out.println("Name     : " + rs.getString("name"));
                System.out.println("Course ID: " + rs.getInt("course_id"));
                System.out.println("Gender   : " + rs.getString("gender").charAt(0));
                System.out.println("Phone    : " + rs.getLong("phone"));
                System.out.println("DOB      : " + rs.getDate("dob"));
                System.out.println("Address  : " + rs.getString("address"));
                System.out.println("------------------------------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            // 5. Close connection
            try {
                if (connection != null) connection.close();
                System.out.println("Connection closed.");
            } catch (SQLException e) {
                System.out.println("Failed to close: " + e.getMessage());
            }
        }
    }
}