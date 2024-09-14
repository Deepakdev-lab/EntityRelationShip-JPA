package com.entityrelationship.er.repo;

import com.entityrelationship.er.model.Mission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissionRepo extends JpaRepository<Mission,Integer> {
}
