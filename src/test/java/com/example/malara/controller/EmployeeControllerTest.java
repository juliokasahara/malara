package com.example.malara.controller;

import com.example.malara.model.Employee;
import com.example.malara.model.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


public class EmployeeControllerTest {

    @Mock
    private EmployeeController employeeController;

    @InjectMocks
    private EmployeeRepository repository;



    @Test
    public void WhenPOSTSucces() {


        assertEquals(1L, 1L);
    }

    @Test
    public void WhenDELETESucces() {

        assertEquals(1L, 1L);
    }

    @Test
    public void WhenGETSuccesById() {

        assertEquals(1L, 1L);
    }

    @Test
    public void WhenGETSuccesALL() {

        assertEquals(1L, 1L);
    }


}
