package com.javaTpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseName

{
	@Autowired
	private ServiceName serviceName;


	@PostMapping(value="/template")
	public User addUser(@RequestBody User userRecord)
	{  
		serviceName.addUser(userRecord);  
		StringBuilder sb = new StringBuilder(userRecord.getName());
		sb.reverse();
		userRecord.setName(sb.toString());	
		return userRecord;
	}
}