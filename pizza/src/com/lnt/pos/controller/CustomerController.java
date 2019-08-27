package com.lnt.pos.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lnt.pos.bean.CartBean;
import com.lnt.pos.bean.CredentialsBean;
import com.lnt.pos.bean.CreditcardBean;
import com.lnt.pos.bean.FoodBean;
import com.lnt.pos.bean.OrderBean;
import com.lnt.pos.bean.ProfileBean;
import com.lnt.pos.bean.StoreBean;
import com.lnt.pos.service.Customer;

@RequestMapping("/customer")
@Controller
public class CustomerController {
	@Autowired
	private Customer cuserv;
	@RequestMapping("/reg")
	public ModelAndView meth1()
	{
			return new ModelAndView("CustomerLogin");	
	}
	@RequestMapping("/userreg")
	public ModelAndView meth2()
	{
		return new ModelAndView("UserRegister");	 
	}
	
	@RequestMapping("/newreg")
	public ModelAndView meth3(@ModelAttribute("pb") ProfileBean pb,Model m)
	{
		cuserv.getProfile(pb);
		m.addAttribute("uid",pb.getUserID());
		System.out.println(pb.getUserID());
		return new ModelAndView("UserCred");	 
		
	}
	@RequestMapping("/usercred")
	public ModelAndView meth4(@ModelAttribute("cb") CredentialsBean cb,@ModelAttribute("pb") ProfileBean pb,Model m)
	{
		
		cuserv.addCredential(cb, pb);
		return new ModelAndView("CustomerLogin");
		
	}
	@RequestMapping("/cuslog")
	public ModelAndView meth5(@RequestParam("usr")String usr,@RequestParam("pass")String pass,Model m)
	{
		if((usr.equals("US_002"))&&(pass.equals("123")))
		{
			m.addAttribute("vallf",cuserv.viewAllFood());
			return new ModelAndView("AddToCart");
		}
		if((usr.equals("US_003"))&&(pass.equals("123")))
		{
			return new ModelAndView("ViewCart");
		}
		if((usr.equals("US_004"))&&(pass.equals("123")))
		{
			m.addAttribute("vallf",cuserv.viewAllFood());
			m.addAttribute("vpf",cuserv.viewProfile());
			return new ModelAndView("ModifyDeleteCart");
		}
		if((usr.equals("US_005"))&&(pass.equals("123")))
		{
			m.addAttribute("vc",cuserv.viewAllCart());
			m.addAttribute("vas",cuserv.viewAllStore());
			m.addAttribute("vpf",cuserv.viewProfile());
			return new ModelAndView("OrderConfirmation");
		}
		if((usr.equals("US_006"))&&(pass.equals("123")))
		{
			return new ModelAndView("CancelOrder");
		}
		else
		{
			return new ModelAndView("LoginFailed");
		}
		
	}
	@RequestMapping("/viewallf")
	public ModelAndView meth6(Model m)
	{
		m.addAttribute("valf",cuserv.viewAllFood());
		return new ModelAndView("ViewAllF");
		
	}
	@RequestMapping("/viewallp")
	public ModelAndView meth7(Model m)
	{
		m.addAttribute("vpf",cuserv.viewProfile());
		return new ModelAndView("ViewAllP");
		
	}
	@RequestMapping("/viewallstore")
	public ModelAndView meth8(Model m)
	{
		m.addAttribute("vas",cuserv.viewAllStore());
		return new ModelAndView("ViewAllStore");
		
	}
	@RequestMapping("/viewallc")
	public ModelAndView meth9(Model m)
	{
		m.addAttribute("vc",cuserv.viewAllCart());
		return new ModelAndView("ViewAllCart");
		
	}
	@RequestMapping("/atc")
	public ModelAndView meth10(@ModelAttribute("cb")CartBean cb,@ModelAttribute("pf")ProfileBean pf,@ModelAttribute("fb")FoodBean fb,Model m)
	{
		
		cuserv.addToCart(cb, pf, fb);
		return new ModelAndView("RegisterSuccessCust");
		
	}
	@RequestMapping("/viewallcart")
	public ModelAndView meth11(@RequestParam("userID")String uid,Model m)
	{
		System.out.println(cuserv.viewCart(uid));
		m.addAttribute("vc",cuserv.viewCart(uid));
		return new ModelAndView("ViewAllCart");
		
	}
	@RequestMapping("/modifycart")
	public ModelAndView meth12(@ModelAttribute("userID")ProfileBean uid,@ModelAttribute("cartID")CartBean cid,@ModelAttribute("foodID")FoodBean fid,Model m)
	{
		cuserv.modifyCart(cid, uid, fid);
		return new ModelAndView("RegisterSuccessCust");
	}
	@RequestMapping("/deletecart")
	public ModelAndView meth13(@RequestParam("userID")int uid,@RequestParam("cartID")int cid,Model m)
	{	ArrayList<Integer>al1=new ArrayList<Integer>();
		al1.add(uid);
		ArrayList<Integer>al2=new ArrayList<Integer>();
		al2.add(cid);
		cuserv.removeCart(al1, al2);
		return new ModelAndView("RegisterSuccessCust");
	}

	@RequestMapping("/confirmorder")
	public ModelAndView meth15(@ModelAttribute("ob")OrderBean ob,@ModelAttribute("cb")CartBean cb,@ModelAttribute("pb")ProfileBean pb,@ModelAttribute("sb")StoreBean sb,Model m)
	{
		cuserv.confirmOrder(ob, cb, pb, sb);
		return new ModelAndView("Payment");
		
	}
	
	@RequestMapping("/cancelorder")
	public ModelAndView meth17(@ModelAttribute("orderID")OrderBean oid)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(oid.getOrderID());
		cuserv.cancelOrder(al);
		return new ModelAndView("RegisterSuccessCust");
	}
	@RequestMapping("/viewallorder")
	public ModelAndView meth18(Model m)
	{
		m.addAttribute("vo",cuserv.viewAllOrder());
		return new ModelAndView("ViewOrder");
		
	}
	@RequestMapping("/payment")
	public ModelAndView meth19(@ModelAttribute("ccb") CreditcardBean ccb,@ModelAttribute("ob") OrderBean ob,Model m)
	{
		
		cuserv.addPayment(ccb, ob);
		return new ModelAndView("CustomerLogin");
		
	}
	
	
}
