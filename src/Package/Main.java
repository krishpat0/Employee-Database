package Package;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("CRUD OPERATION USING MYSQL JDBC CONNECTOR");

        System.out.println("1.Create | 2.Read | 3.Update | 4.Delete");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Input: ");
        int key = scanner.nextInt();
        Employee employee = new Employee();

        // CREATE DATABASE
        // employee.createDatabase();

        // CREATE TABLE
        // employee.createTable();

        // CRUD

        // CREATE DATA INTO TABLE
        // employee.createData();

        // READ DATA FROM TABLE
        // employee.readData();

        // UPDATE DATA INTO TABLE
        // employee.updateData();

        // DELETE DATA FROM TABLE
        // employee.deleteData();

        switch (key) {
            case 1:
                employee.createData();
                break;

            case 2:
                employee.readData();
                break;

            case 3:
                employee.updateData();
                break;

            case 4:
                employee.deleteData();
                break;

            default:
                break;
        }

    }
}
