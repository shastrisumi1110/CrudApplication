package com.Sumiran.Dode.CrudApplication.service;

import com.Sumiran.Dode.CrudApplication.model.Employee;
import com.Sumiran.Dode.CrudApplication.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Employee addEmployee(Employee e) {
        Employee emp = employeeRepo.save(e);
        return emp;
    }

    @Override
    public String removeEmployee(int id) {
        employeeRepo.deleteById(id);
        return "Deleted Data Successfully";
    }

    @Override
    public Optional<Employee> findEmpById(int id) {
        Optional<Employee> emp = employeeRepo.findById(id);
        if(emp.isPresent()){
            return emp;
        }else{
          return null;
        }
    }

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> empList = employeeRepo.findAll();

        return empList;
    }

    @Override
    public String updateEmployee(int id) {
        Optional<Employee> emp = employeeRepo.findById(id);
        if(emp.isPresent()){
            Employee employee = new Employee();
            employeeRepo.save(employee);
            return "Updated Successfull";
        }else{
            return "Employee Not Found";
        }
    }
}
