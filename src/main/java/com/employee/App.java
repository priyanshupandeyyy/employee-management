package com.employee;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Employee Management System ====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Remove Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Designation: ");
                    String designation = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    Employee emp = new Employee(id, name, designation, salary);
                    EmployeeManager.addEmployee(emp);
                    break;

                case 2:
                    EmployeeManager.viewEmployees();
                    break;

                case 3:
                    System.out.print("Enter ID to remove: ");
                    int rid = sc.nextInt();
                    EmployeeManager.removeEmployee(rid);
                    break;

                case 4:
                    System.out.print("Enter ID to update salary: ");
                    int uid = sc.nextInt();
                    Employee e = EmployeeManager.findEmployeeById(uid);
                    if (e == null) {
                        System.out.println("Employee not found!");
                    } else {
                        System.out.print("Enter new salary: ");
                        double newSal = sc.nextDouble();
                        e.setSalary(newSal);
                        System.out.println("Salary updated successfully!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
        sc.close();
    }
}
