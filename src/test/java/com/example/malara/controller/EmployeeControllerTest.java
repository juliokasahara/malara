package com.example.malara.controller;

import com.example.malara.model.Employee;
import com.example.malara.model.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


public class EmployeeControllerTest {

    @Mock
    private EmployeeController employeeController;

    @MockBean
    private EmployeeRepository repository;

    @Test
    public void testSoma() {

//        when(repository.findById(any())).thenThrow(mockEmployee());
//        var result = employeeController.one(10L);
//        assertEquals(10L, result.getId());
    }

    private Optional<Employee> mockEmployee(){
        Employee employee = new Employee();
        employee.setId(10L);
        employee.setName("Tste");
        employee.setRole("ADM");

        Optional<Employee> optionalEmployee = Optional.of(employee);
        return optionalEmployee;
    }

}
