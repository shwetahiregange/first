package com.javaTpoint.dao;

import org.springframework.data.repository.CrudRepository;
import com.javaTpoint.model.StudentStatus;
public interface StudentStatusRepository extends CrudRepository<StudentStatus, Integer> {
	StudentStatus findById(int id);
	void deleteById(int id);
	StudentStatus status(boolean status);
	
}
