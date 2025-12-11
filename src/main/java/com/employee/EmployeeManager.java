package com.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private static List<Employee> employees = new ArrayList<>();

    public static void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("✅ Employee added successfully!");
    }

    public static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found!");
            return;
        }
        System.out.println("\n--- Employee List ---");
        for (Employee e : employees) {
            e.display();
        }
    }

    public static void removeEmployee(int id) {
        boolean removed = employees.removeIf(e -> e.getId() == id);
        if (removed) System.out.println("Employee removed successfully!");
        else System.out.println("Employee with ID " + id + " not found!");
    }

    public static Employee findEmployeeById(int id) {
        for (Employee e : employees) {
            if (e.getId() == id)
                return e;
        }
        return null;
    }
}
