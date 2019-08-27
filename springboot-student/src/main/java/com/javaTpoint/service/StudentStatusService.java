package com.javaTpoint.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.javaTpoint.dao.StudentStatusRepository;
import com.javaTpoint.model.StudentStatus;


@Service
public class StudentStatusService {
	 @Autowired 
	 private  StudentStatusRepository studentStatusRepository; 
	 
		public void addUser(StudentStatus studentStatus)
	    {   
			studentStatusRepository.save(studentStatus);
	    }
		
		public  StudentStatus getUser(int id)
		{  
			return  studentStatusRepository.findById(id);

		}
		public void delete(int id)
		{  
			studentStatusRepository.delete(getUser(id));  
		}
		
		public StudentStatus setStatus(StudentStatus studentStatus)
		{
			return studentStatusRepository.status(true);
		}
}
