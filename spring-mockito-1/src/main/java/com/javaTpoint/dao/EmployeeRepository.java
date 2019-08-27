package com.javaTpoint.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaTpoint.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
