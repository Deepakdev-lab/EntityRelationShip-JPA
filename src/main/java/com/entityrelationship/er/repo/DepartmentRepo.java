package com.entityrelationship.er.repo;

import com.entityrelationship.er.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository <Department,Integer> {
}
