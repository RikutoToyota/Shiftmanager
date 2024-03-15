package javaFW.A.ShiftManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javaFW.A.ShiftManager.model.PostModel;

@Repository
public interface PostRepository extends JpaRepository<PostModel, Long> {
	
}
