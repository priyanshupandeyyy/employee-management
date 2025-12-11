package com.employee;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void testEmployeeCreation() {
        Employee emp = new Employee(101, "Priyanshu", "Developer", 60000.0);

        assertEquals(101, emp.getId());
        assertEquals("Priyanshu", emp.getName());
        assertEquals("Developer", emp.getDesignation());
        assertEquals(60000.0, emp.getSalary(), 0.001);
    }

    @Test
    public void testSalaryUpdate() {
        Employee emp = new Employee(102, "Riya", "Tester", 45000.0);
        emp.setSalary(50000.0);

        assertEquals(50000.0, emp.getSalary(), 0.001);
    }
}
