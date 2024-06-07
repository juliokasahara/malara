package com.example.malara.controller;

import com.example.malara.model.Employee;
import com.example.malara.model.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeRepository repository;

    @GetMapping("/{id}")
    public Employee one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                        "Erro pesquisando id: " + id));
    }
    @PostMapping
    public ResponseEntity<Employee> insert(@RequestBody Employee employee){
        var EmployeeSalvo = repository.save(employee);

        return ResponseEntity.ok(EmployeeSalvo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> insert(@PathVariable Long id) {
        boolean employeeFound = repository.existsById(id);

        if(!employeeFound){
            return ResponseEntity.notFound().build();
        }

        repository.deleteById(id);

        return ResponseEntity.ok("Deletado com sucesso!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,@RequestBody Employee employee) {
        var employeeDB = repository.findById(id).orElseThrow(() -> new RuntimeException("Erro ao recuperar os ddados"));

        employeeDB.setName(employee.getName());

        repository.save(employeeDB);

        return ResponseEntity.ok("Atualizado!");
    }

    @GetMapping
    public ResponseEntity<?> all(
            @RequestParam int page,
            @RequestParam int size
    ) {
        if (page < 1) {
            return ResponseEntity.badRequest().body("page deve ser > 0");
        }
        if (size > 500) {
            return ResponseEntity.badRequest().body("size deve ser <= 500");

        }
        final List<Employee> listEmployee = repository.findAll();
        return ResponseEntity.ok(listEmployee);
    }

}
