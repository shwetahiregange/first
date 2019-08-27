package com.javaTpoint.service;

import java.util.ArrayList;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaTpoint.dao.StudentNameRepository;
import com.javaTpoint.model.StudentName;

@Service 
public class StudentNameService {


	@Autowired  
	private StudentNameRepository studentNameRepository;  
     

	public void addUser(StudentName studentName)
	{  
		studentNameRepository.save(studentName);  
	}

	public StudentName getUser(int id)
	{  
		return  studentNameRepository.findById(id);

	}

	public ArrayList<StudentName> getAllUsers()
	{  
		ArrayList<StudentName>studentName = new ArrayList<>();  
		studentNameRepository.findAll().forEach(studentName::add);  
		return studentName; 
	}

	public void delete(int id)
	{  
		studentNameRepository.delete(getUser(id));  
	}
}  

