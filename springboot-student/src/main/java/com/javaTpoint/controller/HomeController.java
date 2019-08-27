package com.javaTpoint.controller;

import org.apache.logging.log4j.LogManager;


import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.javaTpoint.StudentApplication;
import com.javaTpoint.model.StudentName;
import com.javaTpoint.model.StudentStatus;
import com.javaTpoint.service.BufferReadService;
import com.javaTpoint.service.BufferWriteforIdService;
import com.javaTpoint.service.BufferWriteforNameService;
import com.javaTpoint.service.FileReadService;
import com.javaTpoint.service.StudentNameService;
import com.javaTpoint.service.StudentStatusService;

@Controller
public class HomeController {

	private static final Logger logger = LogManager.getLogger(StudentApplication.class);


	@Autowired  
	private StudentNameService studentNameService;  

	@Autowired  
	private StudentStatusService studentStatusService; 

	@Autowired  
	private FileReadService i1;

	@Autowired  
	private BufferReadService i2;

	@Autowired  
	private BufferWriteforIdService e1;

	@Autowired
	private BufferWriteforNameService e2;

	@RequestMapping("/")  
	public String indexPage()
	{  
		return "index";  
	}

	@RequestMapping("/generate")  
	public String generateIdPage()
	{  
		return "generate";  
	}

	@RequestMapping(value="/Generate", method=RequestMethod.POST)  
	public String idGenerate()
	{  
		logger.debug("Id generation");
		for(int i=1;i<=20;i++)
		{
			StudentStatus studentStatus=new StudentStatus();
			studentStatus.setId((int)i);
			studentStatus.setStatus(false);
			studentStatusService.addUser(studentStatus);
		}
		logger.debug("Id generated successfully");

		return "successpage";  

	}

	@RequestMapping("/addstud")  
	public String addStudent(ModelMap model){ 

		return "addstud";  
	}

	@RequestMapping("/searchstud")  
	public String searchStudent(){  
		return "searchstud";  
	}

	@RequestMapping(value="/Search", method=RequestMethod.GET)  
	public ModelAndView getUser(@RequestParam("id")int id, Model m){  

		m.addAttribute("ss", studentNameService.getUser(id)) ;
		return new ModelAndView("studentsearch");
	} 

	@RequestMapping(value="/liststud", method = RequestMethod.GET)  


	public ModelAndView getUsers(StudentName studentName,Model m){    
		m.addAttribute("tt", studentNameService.getAllUsers());
		return new ModelAndView("liststud");
	}

	@RequestMapping(value="/deleteStud")  
	public String deletePage(){  
		return "deleteStud";  
	}

	@RequestMapping(value="/Delete" ,method=RequestMethod.POST)  
	public String deleteStudent(int id){ 
		studentNameService.delete(id);
		StudentStatus updateRow= studentStatusService.getUser(id);
		updateRow.setStatus(false);
		studentStatusService.addUser(updateRow);
		return "successpage";  
	}

	@RequestMapping(value="/updateStud")  
	public String updatePage(){  
		return "updateStud";  
	}

	@RequestMapping(value="/Update", method=RequestMethod.POST)  
	public String updateStudent(StudentName studentName){  
		StudentName updateRecord= studentNameService.getUser(studentName.getId());
		updateRecord.setName(studentName.getName());
		studentNameService.addUser(updateRecord);
		return "successpage";  
	}

	@RequestMapping(value="/Addition", method = RequestMethod.POST)  
	public String addUser( int id,StudentName studentName)
	{  
		StudentStatus updateRow= studentStatusService.getUser(id);
		updateRow.setStatus(true);
		studentNameService.addUser(studentName);
		studentStatusService.addUser(updateRow); 
		return "successpage";
	}


	//	Page that Returns the Loadid using FileReader 

	@RequestMapping(value="/loadid")  
	public String loadIdPage(){  
		return "loadid";  
	}

	//		Method of loading FileReader

	@RequestMapping(value="/Load", method = RequestMethod.POST)  
	public String loadId(FileReadService fileReadService)
	{  
		i1.load();
		return "successpage";
	}

	@RequestMapping(value="/Load1", method = RequestMethod.POST)  
	public String loadId(BufferReadService bufferReadService)
	{  
		i2.load();
		return "successpage";
	}

	@RequestMapping(value="/writeid")  
	public String writeDataPage()
	{  
		return "writeid";  
	}

	@RequestMapping(value="/writestatus")  
	public String writeIdToFile()
	{  
		return "writestatus";  
	}

	@RequestMapping(value="/Write1", method = RequestMethod.POST)  
	public String writeIdToText(BufferWriteforIdService bufferWriteforIdService)
	{  
		e1.exportIdToText();
		return "successpage";
	}

	@RequestMapping(value="/Write2", method = RequestMethod.POST)  
	public String writeIdToExcel(BufferWriteforIdService bufferWriteforIdService)
	{  
		e1.exportToExcel();
		return "successpage";
	}

	@RequestMapping(value="/Write3", method = RequestMethod.POST)  
	public String writeIdToPdf(BufferWriteforIdService bufferWriteforIdService)
	{  
		e1.exportToPdf();
		return "successpage";
	}

	@RequestMapping(value="/writename")  
	public String writeNameToFile()
	{  
		return "writename";  
	}

	@RequestMapping(value="/Write4", method = RequestMethod.POST)  
	public String writeNameToText(BufferWriteforNameService bufferWriteforNameService )
	{  
		e2.exportNameToText();
		return "successpage";
	}

	@RequestMapping(value="/Write5", method = RequestMethod.POST)  
	public String writeNameToExcel(BufferWriteforNameService bufferWriteforNameService)
	{  
		e2.exportToExcel();
		return "successpage";
	}

	@RequestMapping(value="/Write6", method = RequestMethod.POST)  
	public String writeNameToPdf(BufferWriteforNameService bufferWriteforNameService)
	{  
		e2.exportToPdf();
		return "successpage";
	}



}

