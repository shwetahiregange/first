package com.javaTpoint.service;

import java.io.FileReader;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaTpoint.StudentApplication;
import com.javaTpoint.dao.Loader;
import com.javaTpoint.model.StudentStatus;
import com.javaTpoint.service.StudentStatusService;

@Service
public class FileReadService implements Loader
{
	@Autowired
	private StudentStatusService studentStatusService;
	private static final Logger logger = LogManager.getLogger(StudentApplication.class);
	
//	public String idGenerate()
//	{  
//		for(int i=20;i<=40;i++)
//		{
//			StudentStatus studentStatus=new StudentStatus();
//			studentStatus.setId((int)i);
//			studentStatus.setStatus(false);
//			studentStatusService.addUser(studentStatus);
//		}
//		return "successpage";  
//	}
	@Override
	public void load()
	{		
	      try{    
                    
	            FileReader fileReader= new FileReader("D://temp.txt");
	            StudentStatus studentStatus=new StudentStatus();
              
	            @SuppressWarnings("resource")
				Scanner sc = new Scanner(fileReader); 
	            
	            while (sc.hasNextLine()) { 
	            	studentStatus.setId(Integer.parseInt(sc.next()));
	            	studentStatus.setStatus(false);
	            	studentStatusService.addUser(studentStatus);
	              logger.info(sc.nextLine()); 
	            }
   
	            fileReader.close();    
	          }catch(Exception e){System.out.println(e);}    
	         }    
	}
  