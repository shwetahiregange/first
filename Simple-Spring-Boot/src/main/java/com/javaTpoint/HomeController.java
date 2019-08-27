package com.javaTpoint;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;   
@Controller  
public class HomeController
{  
	 @Autowired
	   RestTemplate restTemplate;


	@RequestMapping("/")  
	public String index()
	{
		return "index";
	}	
	
		@PostMapping(value="/rever")  
		public ModelAndView reverse(@ModelAttribute User user){  
			ModelAndView modelAndView = new ModelAndView(); 
			
			  HttpHeaders headers = new HttpHeaders();
		      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		      HttpEntity<User> entity = new HttpEntity<User>(user,headers);
		      
		      user.setName(restTemplate.exchange(
		         "http://localhost:8080/template", HttpMethod.POST, entity, User.class).getBody().getName());
			
//			char ch[]=user.getName().toCharArray();  
//			 String rev=""; 
//			   for(int i=ch.length-1;i>=0;i--) {
//			        rev+=ch[i];  
//			 	   }
//			   
//			   user.setName(rev.toString());
			   
			modelAndView.addObject("user", user);    
			
			return new ModelAndView("user-data");  
			}

	}



