package com.lnt.pos.dao;

import java.util.*;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.lnt.pos.bean.CartBean;
import com.lnt.pos.bean.CredentialsBean;
import com.lnt.pos.bean.CreditcardBean;
import com.lnt.pos.bean.FoodBean;
import com.lnt.pos.bean.OrderBean;
import com.lnt.pos.bean.ProfileBean;
import com.lnt.pos.bean.StoreBean;

public class CustDaoImpl implements CustDao{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String getProfile(ProfileBean pb) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(pb);
		return null;
	}

	@Override
	public String addCredential(CredentialsBean cb, ProfileBean pb) {
		// TODO Auto-generated method stub
		
		sessionFactory.getCurrentSession().save(cb);
		return null;
	}

	@Override
	public String addToCart(CartBean cartbean, ProfileBean profilebean,FoodBean foodbean) {
		// TODO Auto-generated method stub
		
		cartbean.setPb(profilebean);
		cartbean.setFb(foodbean);
		Query up=sessionFactory.getCurrentSession().createQuery("select price from FoodBean where foodID='"+foodbean.getFoodID()+"'");
		List ap=(List)up.list();
		double c=(double)ap.get(0);
		System.out.println(c);
		    if(cartbean.getFoodSize().equals("small")) {
			cartbean.setCost(c*cartbean.getQuantity());}
		    if(cartbean.getFoodSize().equals("medium")) {
		    cartbean.setCost(c*cartbean.getQuantity());}
			if(cartbean.getFoodSize().equals("large")) {
			cartbean.setCost(c*cartbean.getQuantity());}
		sessionFactory.getCurrentSession().save(cartbean);
		return null;
	}

	@Override
	public ArrayList<FoodBean> viewAllFood() {
		// TODO Auto-generated method stub
		Query q=sessionFactory.getCurrentSession().createQuery("from FoodBean group by name");
		return (ArrayList<FoodBean>) q.list();
	}

	@Override
	public ArrayList<ProfileBean> viewProfile() {
		// TODO Auto-generated method stub
		Query q=sessionFactory.getCurrentSession().createQuery("from ProfileBean");
		return (ArrayList<ProfileBean>) q.list();
	}

	@Override
	public ArrayList<CartBean> viewCart(String userId) {
		// TODO Auto-generated method stub
		Query q=sessionFactory.getCurrentSession().createQuery("from CartBean where userID=:uid");
		q.setParameter("uid", userId);
		return (ArrayList<CartBean>) q.list();
	}

	@Override
	public boolean modifyCart(CartBean cartbean, ProfileBean profilebean,FoodBean foodbean) {
		// TODO Auto-generated method stub
		if(profilebean!=null && cartbean!=null)
		{
			cartbean.setPb(profilebean);
			cartbean.setFb(foodbean);
			Query up=sessionFactory.getCurrentSession().createQuery("select price from FoodBean where foodID='"+foodbean.getFoodID()+"'");
			List ap=(List)up.list();
			double c=(double)ap.get(0);
			
			 if(cartbean.getFoodSize().equals("small")) {
					cartbean.setCost(c*cartbean.getQuantity());}
				    if(cartbean.getFoodSize().equals("medium")) {
				    cartbean.setCost(c*cartbean.getQuantity());}
					if(cartbean.getFoodSize().equals("large")) {
					cartbean.setCost(c*cartbean.getQuantity());}
		sessionFactory.getCurrentSession().update(cartbean);
		return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public int removeCart(ArrayList<Integer> userId, ArrayList<Integer> cartId) {
		// TODO Auto-generated method stub
		System.out.println(userId);
		System.out.println(cartId);
		if(userId!=null && cartId!=null)
		{
			int uid=Integer.parseInt(userId.get(0).toString());
			int cid=Integer.parseInt(cartId.get(0).toString());		
			Query q=sessionFactory.getCurrentSession().createQuery("delete from CartBean where userID=:uid and cartId=:cid");
			q.setParameter("uid",uid);
			q.setParameter("cid",cid);
			q.executeUpdate();
		return 1;
		}
		else
		{
			return 0;
		}
	}
	
	@Override
	public ArrayList<StoreBean> viewAllStore() {
		// TODO Auto-generated method stub
		Query q=sessionFactory.getCurrentSession().createQuery("from StoreBean");
		return (ArrayList<StoreBean>) q.list();
	}
	@Override
	public ArrayList<CartBean> viewAllCart() {
		// TODO Auto-generated method stub
		Query q=sessionFactory.getCurrentSession().createQuery("from CartBean");
		return (ArrayList<CartBean>) q.list();
	}

	@Override
	public String confirmOrder(OrderBean orderbean, CartBean cartbean, ProfileBean profilebean, StoreBean storebean) {
		// TODO Auto-generated method stub
		Query a=sessionFactory.getCurrentSession().createQuery("select cost from CartBean where cartID='"+cartbean.getCartID()+"'");
		List ar=(List)a.list();
		orderbean.setOrderStatus("pending");
		System.out.println(ar.get(0).toString());
		orderbean.setTotalPrice(Double.parseDouble(ar.get(0).toString()));
		orderbean.setPb(profilebean);
		orderbean.setCb(cartbean);
		orderbean.setSb(storebean);
		sessionFactory.getCurrentSession().save(orderbean);
		return ar.get(0).toString();
	}

	@Override
	public int cancelOrder(ArrayList<Integer> orderId) {
		// TODO Auto-generated method stub
		int re=Integer.parseInt(orderId.get(0).toString());
		System.out.println(re);
		if(orderId!= null)
		{
			Query q=sessionFactory.getCurrentSession().createQuery("delete from OrderBean where orderID=:oid");
			q.setParameter("oid",re);
			q.executeUpdate();
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	@Override
	public ArrayList<OrderBean> viewAllOrder() {
		// TODO Auto-generated method stub
		Query q=sessionFactory.getCurrentSession().createQuery("from OrderBean");
		return (ArrayList<OrderBean>) q.list();
	}

	@Override
	public String addPayment(CreditcardBean ccb, OrderBean ob) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(ccb);
		return null;
	}
}
