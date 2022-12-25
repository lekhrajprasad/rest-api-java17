package com.lpras.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lpras.rest.model.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

}