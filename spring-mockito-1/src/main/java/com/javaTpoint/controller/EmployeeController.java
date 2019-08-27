package com.javaTpoint.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaTpoint.dao.EmployeeRepository;
import com.javaTpoint.model.Employee;
import com.javaTpoint.model.Response;


@RestController
@RequestMapping("/EmployeeService")
public class EmployeeController {
	
@Autowired
 public EmployeeRepository employeeRepository;

@PostMapping("/addEmployee")  
public Response addEmployee(@RequestBody Employee employee) {
	employeeRepository.save(employee);
	return new Response(employee.getId()+" inserted", Boolean.TRUE);
}

@GetMapping("/getEmployees")

    public Response getAllEmployees() {
		List<Employee> employees= employeeRepository.findAll();
	return new Response("record counts : " + employees.size() , Boolean.TRUE);
}

}
