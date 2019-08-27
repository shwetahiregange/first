package com.javaTpoint;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController  
public class UserController {
	@Autowired  
	private UserService userService;   

	@GetMapping("/list")  
	public List<UserRecord> getAllUser(){  
		return userService.getAllUsers();  
	}  

	@PostMapping(value="/add-user")  
	public String addUser(@RequestBody UserRecord userRecord){  
		userService.addUser(userRecord); 
		return "successfully added";

	}  
	@GetMapping(value="/user/{id}")  
	public UserRecord getUser(@PathVariable int id){  
		return  userService.getUser(id);  
	}


	@PutMapping(value="/update")
	public String updateUser(@RequestBody UserRecord userRecord)
	{
		
		userService.addUser(userRecord); 
		
		return "Updated";
	}

	@DeleteMapping(value="/delete/{id}")  
	public String deleteUser(@PathVariable int id){  
		userService.delete(id);  
		return "Successfully deleted";

	}
}  

