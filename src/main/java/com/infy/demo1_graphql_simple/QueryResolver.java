package com.infy.demo1_graphql_simple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class QueryResolver implements GraphQLQueryResolver {
	
	@Autowired
    private MessageService employeeService;//Resolvers calls service to populate data
    
	public String getMessage( ) {
        return employeeService.getMessage();
    }

    
	public List<Employee> employees( ) {
        return employeeService.getAllEmployees();
    }
	
	public String message( ) {
        return employeeService.getMessage();
    }

}
