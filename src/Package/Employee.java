package Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee {

    public void createDatabase() {

        try {
            String url = "jdbc:mysql://localhost:3306";
            String userName = "root";
            String password = "KVP1842";

            Connection conn = DriverManager.getConnection(url, userName, password);

            Statement stm = conn.createStatement();

            String query = "create database EmployeeDatabase";
            stm.execute(query);

            System.out.println("Database Created Successfully");

            // connection close
            conn.close();
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void createTable() {
        try {
            String url = "jdbc:mysql://localhost:3306/employeedatabase";
            String userName = "root";
            String password = "KVP1842";

            Connection conn = DriverManager.getConnection(url, userName, password);

            Statement stm = conn.createStatement();

            String query = "create table employee(epm_id int(3), emp_name varchar(20), emp_email varchar(30))";
            stm.execute(query);

            System.out.println("Table Created Successfully");

            // connection close
            conn.close();
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void createData() {

        try {
            String url = "jdbc:mysql://localhost:3306/";
            String db = "employeedatabase";
            String userName = "root";
            String password = "KVP1842";

            Connection conn = DriverManager.getConnection(url + db, userName, password);

            String query = "INSERT into employee (epm_id,emp_name,emp_email) VALUES (?,?,?)";

            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, 10);
            pstm.setString(2, "Krishna");
            pstm.setString(3, "krishna@gmail.com");

            pstm.execute();

            System.out.println("Data Inserted Successfully");

            // connection close
            conn.close();
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void readData() {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String db = "employeedatabase";
            String userName = "root";
            String password = "KVP1842";

            Connection conn = DriverManager.getConnection(url + db, userName, password);

            String query = "SELECT * from employee";

            Statement stm = conn.createStatement();

            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                System.out.println("id= " + rs.getInt(1));
                System.out.println("name= " + rs.getString(2));
                System.out.println("email= " + rs.getString(3));
                System.out.println();

            }

            stm.execute(query);

            System.out.println("Data Read Successfully");

            // connection close
            conn.close();
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void updateData() {

        try {
            String url = "jdbc:mysql://localhost:3306/";
            String db = "employeedatabase";
            String userName = "root";
            String password = "KVP1842";

            Connection conn = DriverManager.getConnection(url + db, userName, password);

            String query = "UPDATE employee SET epm_id=? where emp_name=?";

            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, 11);
            pstm.setString(2, "Krishna");

            pstm.executeUpdate();

            System.out.println("Update Data Successfully");

            // connection close
            conn.close();
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deleteData() {
        try {
            String url = "jdbc:mysql://localhost:3306/employeedatabase";
            String userName = "root";
            String password = "KVP1842";

            Connection conn = DriverManager.getConnection(url, userName, password);

            Statement stm = conn.createStatement();

            String query = "DELETE from employee where epm_id=11 ";
            stm.executeUpdate(query);

            System.out.println("Deleted data successfully");

            // connection close
            conn.close();
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
