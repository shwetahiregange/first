package com.javatpoint.springbootexample3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{
	@Autowired
	AlienRepo repo;	
	
	
	@RequestMapping("/")
	public String indexPage()
	{  
		return "home.jsp";  
	}
	
	
@RequestMapping("/Addition")
public String addAlien(Pojo pojo)
{  
	repo.save(pojo);
	return "home.jsp";  
}
@RequestMapping("/getAlien")
public ModelAndView getAlien(@RequestParam int id)
{  
	ModelAndView mv=new ModelAndView("showData.jsp");
	Pojo pojo=repo.findById(id).orElse(new Pojo());
	mv.addObject(pojo);
	return mv;  
}

}





