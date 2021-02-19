package com.postgre.springpostgresdocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postgre.springpostgresdocker.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
