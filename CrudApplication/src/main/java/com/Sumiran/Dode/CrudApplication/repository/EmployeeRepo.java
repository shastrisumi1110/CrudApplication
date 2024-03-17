package com.Sumiran.Dode.CrudApplication.repository;

import com.Sumiran.Dode.CrudApplication.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {



}
