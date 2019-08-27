package com.lnt.pos.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lnt.pos.bean.FoodBean;
import com.lnt.pos.bean.OrderBean;
import com.lnt.pos.bean.StoreBean;
import com.lnt.pos.service.Administrator;

@RequestMapping("/admin")
@Controller
public class AdminController {
	@Autowired
	private Administrator adserv;
	@RequestMapping("/reg")
	public ModelAndView meth1()
	{
			return new ModelAndView("AdminLogin");	
	}
	
	@RequestMapping("/login")
	public ModelAndView meth2(@RequestParam("usr")String usr,@RequestParam("pass")String pass,Model m)
	{
		if((usr.equals("AD_001"))&&(pass.equals("123")))
		{
			return new ModelAndView("AddAdmin");
		}
		if((usr.equals("AD_002"))&&(pass.equals("123")))
		{
			return new ModelAndView("DeleteAdmin");
		}
		if((usr.equals("AD_003"))&&(pass.equals("123")))
		{
			return new ModelAndView("ViewAdmin");
		}
		if((usr.equals("AD_004"))&&(pass.equals("123")))
		{
			return new ModelAndView("ModifyAdmin");
		}
		if((usr.equals("AD_005"))&&(pass.equals("123")))
		{
			return new ModelAndView("AddFood");
		}
		if((usr.equals("AD_006"))&&(pass.equals("123")))
		{
		
			 m.addAttribute("valls",adserv.viewAllStore());
//			 m.addAttribute("vallf",adserv.viewAllFood(String.valueOf(new StoreBean().getStoreID())));
			return new ModelAndView("DeleteFood");
		}
		if((usr.equals("AD_007"))&&(pass.equals("123")))
		{
			return new ModelAndView("ViewFood");
		}
		if((usr.equals("AD_008"))&&(pass.equals("123")))
		{
			
			return new ModelAndView("ModifyFood");
		}
		if((usr.equals("AD_009"))&&(pass.equals("123")))
		{
			return new ModelAndView("ModifyOrder");
		}
		else
		{
			return new ModelAndView("LoginFailed");
		}
	}
	@RequestMapping("/addstore")
	public ModelAndView meth3(@ModelAttribute("sb") StoreBean sb,Model m)
	{
		adserv.addStore(sb);
		return new ModelAndView("RegisterSuccess");	 
		
	}
	@RequestMapping("/addfood")
	public ModelAndView meth8(@ModelAttribute("fb") FoodBean fb,@ModelAttribute("sb") StoreBean sb,Model m)
	{
		adserv.addFood(fb, sb);
		return new ModelAndView("RegisterSuccess");	 
		
	}
	@RequestMapping("/viewstore")
	public ModelAndView meth4(@RequestParam("storeID")String sid,Model m)
	{
		m.addAttribute("vs",adserv.viewStore(sid));
		return new ModelAndView("ViewStore");
		
	}
	@RequestMapping("/viewfood")
	public ModelAndView meth9(@RequestParam("foodID")String fid,Model m)
	{
		m.addAttribute("vf",adserv.viewFood(fid));
		return new ModelAndView("ViewFood2");
		
	}
	@RequestMapping("/viewallstore")
	public ModelAndView meth5(Model m)
	{
		m.addAttribute("vas",adserv.viewAllStore());
		return new ModelAndView("ViewAllStore");
		
	}
	@RequestMapping("/viewallf")
	public ModelAndView meth13(Model m)
	{
		m.addAttribute("valf",adserv.viewAllFood());
		return new ModelAndView("ViewAllF");
		
	}
	@RequestMapping("/viewallfood")
	public ModelAndView meth10(@RequestParam("storeID")String sid,Model m)
	{
		System.out.println(adserv.viewAllFood(sid));
		m.addAttribute("vaf",adserv.viewAllFood(sid));
		return new ModelAndView("ViewAllFood");
		
	}
	@RequestMapping("/modifystore")
	public ModelAndView meth6(@ModelAttribute("storeID")StoreBean sid,Model m)
	{
		adserv.modifyStore(sid);
		return new ModelAndView("RegisterSuccess");
	}
	@RequestMapping("/deletestore")
	public ModelAndView meth7(@ModelAttribute("storeID")StoreBean sid)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(sid.getStoreID());
		adserv.removeStore(al);
		return new ModelAndView("RegisterSuccess");
	}
	@RequestMapping("/modifyfood")
	public ModelAndView meth11(@ModelAttribute("storeID")StoreBean sid,@ModelAttribute("foodID")FoodBean fid,Model m)
	{
		adserv.modifyFood(fid,sid);
		return new ModelAndView("RegisterSuccess");
	}
	@RequestMapping("/deletefood")
	public ModelAndView meth12(@RequestParam("storeID")int sid,@RequestParam("foodID")int fid,Model m)
	{	ArrayList<Integer>al1=new ArrayList<Integer>();
	al1.add(sid);
	ArrayList<Integer>al2=new ArrayList<Integer>();
	al2.add(fid);
		adserv.removeFood(al1,al2);
		return new ModelAndView("RegisterSuccess");
	}
	@RequestMapping("/modifyorder")
	public ModelAndView meth13(@ModelAttribute("ob") OrderBean ob,Model m)
	{
		String s=adserv.changeOrderStatus(ob.getOrderID()+"",ob.getOrderStatus());
		m.addAttribute("os",s);
		return new ModelAndView("RegisterSuccess");
	}

}




