package com.Sumiran.Dode.CrudApplication.service;

import com.Sumiran.Dode.CrudApplication.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    public Employee addEmployee(Employee e);

    public String removeEmployee(int id);

    public Optional<Employee> findEmpById(int id);

    public List<Employee> getAllEmployee();

    public String updateEmployee(int id);

}
