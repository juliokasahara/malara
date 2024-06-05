package com.example.malara.controller;

import com.example.malara.model.Employee;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;


public class EmployeeControllerTest {

    @Mock
    private EmployeeController employeeController;

    @Test
    public void testSoma() {

//        when()
//        employeeController.one(10L)
//        assertEquals(5, resultado);
    }

    private Employee mockEmployee(){
        Employee employee = new Employee();
        employee.setId(10L);
        employee.setName("Tste");
        employee.setRole("ADM");

        return employee;
    }

}
