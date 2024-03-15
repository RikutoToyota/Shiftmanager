package javaFW.A.ShiftManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javaFW.A.ShiftManager.model.ShiftModel;

@Repository
public interface ShiftRepository extends JpaRepository<ShiftModel, Long> {
	
}
