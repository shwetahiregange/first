package com.javaTpoint;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserRecord, Integer>{

	UserRecord findById(int id);

	UserRecord deleteById(int id);
	
	

}
