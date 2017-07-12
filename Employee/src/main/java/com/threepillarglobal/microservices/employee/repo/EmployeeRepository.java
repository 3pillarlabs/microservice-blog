package com.threepillarglobal.microservices.employee.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.threepillarglobal.microservices.employee.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
