package com.infy.demo1_graphql_simple;


import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Integer>  {

}
