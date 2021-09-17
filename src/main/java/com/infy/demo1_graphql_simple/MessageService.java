package com.infy.demo1_graphql_simple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
static final String message = "Hello GraphQL";

@Autowired
private EmployeeRepository employeeRepository ;
	
    public String getMessage()
    {
    	return message;
    }

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return this.employeeRepository.findAll();
	}
}
