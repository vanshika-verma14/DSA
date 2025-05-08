import java.sql.*;
public class JDBCEx {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/db";
        String user = "user";
        String password = "pass";

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");

            stmt = con.createStatement();

            String query = "SELECT * FROM students";
            rs = stmt.executeQuery(query);

            System.out.println("Student Names:");
            while (rs.next()) {
                String name = rs.getString("name");
                System.out.println("- " + name);
            }
        } 

          catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
             e.printStackTrace();
        } 
          catch (SQLException e) {
            System.out.println("Database error.");
            e.printStackTrace();
        } 
        
        finally {
              try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
                System.out.println("Connection closed.");
            } 
              catch (SQLException e) {
                e.printStackTrace();
            }
            }
    }
}
