package com.javaTpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  
public class ServiceName {

	    @Autowired  
	    private RepositoryName userRepository;  
	     
	    public void addUser(User userRecord){  
	        userRepository.save(userRecord);  
	    }  
}
