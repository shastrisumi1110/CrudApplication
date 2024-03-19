package com.Sumiran.Dode.CrudApplication.controllers;

import com.Sumiran.Dode.CrudApplication.model.Employee;
import com.Sumiran.Dode.CrudApplication.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;


    @PostMapping("/addEmp")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee emp = employeeService.addEmployee(employee);
        return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
    }

    @DeleteMapping("/removeEmp/{id}")
    public ResponseEntity<String> removeEmployee(@PathVariable int id){
        employeeService.removeEmployee(id);
        return new ResponseEntity<String>("Removed Successfully",HttpStatus.ACCEPTED);
    }

    @GetMapping("/findEmp/{id}")
    public ResponseEntity<Optional<Employee>> findEmpById(@PathVariable int id){
        Optional<Employee> emp = employeeService.findEmpById(id);
        return new ResponseEntity<Optional<Employee>>(emp,HttpStatus.ACCEPTED);
    }

    @GetMapping("/empList")
    public ResponseEntity<List<Employee>> listOfEmployee(){
        List<Employee> empList = employeeService.getAllEmployee();
        return new ResponseEntity<List<Employee>>(empList,HttpStatus.ACCEPTED);
    }

    @PutMapping("/updateEmp/{id}")
    public ResponseEntity<String> updateEmp(@PathVariable int id){
        employeeService.updateEmployee(id);
        return new ResponseEntity<String>("Updated Successfully",HttpStatus.ACCEPTED);
    }





}
