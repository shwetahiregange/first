package com.lnt.pos.dao;

import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.lnt.pos.bean.CartBean;
import com.lnt.pos.bean.FoodBean;
import com.lnt.pos.bean.OrderBean;
import com.lnt.pos.bean.ProfileBean;
import com.lnt.pos.bean.StoreBean;

public class AdminDaoImpl implements AdminDao{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String addStore(StoreBean storebean) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(storebean);
		return null;
	}

	@Override
	public boolean modifyStore(StoreBean storebean) {
		if(storebean!=null)
		{
		sessionFactory.getCurrentSession().update(storebean);
		return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public int removeStore(ArrayList<Integer> storeId) {
		// TODO Auto-generated method stub
		int re=Integer.parseInt(storeId.get(0).toString());
		System.out.println(re);
		if(storeId!= null)
		{
			Query q=sessionFactory.getCurrentSession().createQuery("delete from StoreBean where storeID=:sid");
			q.setParameter("sid",re);
			q.executeUpdate();
			return 1;
		}
		else
		{
			return 0;
		}
		
	}

	@Override
	public StoreBean viewStore(String storeId) {
		int sid=Integer.parseInt(storeId);
		Query q=sessionFactory.getCurrentSession().createQuery("from StoreBean where storeID=:ss");
		q.setParameter("ss",sid);
		ArrayList al=new ArrayList();
		al=(ArrayList) q.list();
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			return (StoreBean)itr.next();
		}
		return null;
	}

	@Override
	public ArrayList<StoreBean> viewAllStore() {
		// TODO Auto-generated method stub
		Query q=sessionFactory.getCurrentSession().createQuery("from StoreBean");
		return (ArrayList<StoreBean>) q.list();
	}
	
	@Override
	public ArrayList<FoodBean> viewAllFood() {
		// TODO Auto-generated method stub
		Query q=sessionFactory.getCurrentSession().createQuery("from FoodBean");
		return (ArrayList<FoodBean>) q.list();
	}
	@Override
	public String addFood(FoodBean foodbean, StoreBean storebean) {
		// TODO Auto-generated method stub
		foodbean.setSb(storebean);
		sessionFactory.getCurrentSession().save(foodbean);
		return null;
	}
	
	@Override
	public boolean modifyFood(FoodBean foodbean, StoreBean storebean) {
		// TODO Auto-generated method stub
		if(storebean!=null && foodbean!=null)
		{
			foodbean.setSb(storebean);
		sessionFactory.getCurrentSession().update(foodbean);
		return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public int removeFood(ArrayList<Integer> storeId, ArrayList<Integer> foodId) {
		// TODO Auto-generated method stub
		System.out.println(storeId);
		System.out.println(foodId);
		if(storeId!=null && foodId!=null)
		{
			int sid=Integer.parseInt(storeId.get(0).toString());
			int fid=Integer.parseInt(foodId.get(0).toString());		
			Query q=sessionFactory.getCurrentSession().createQuery("delete from FoodBean where storeID=:sid and foodId=:fid");
			q.setParameter("sid",sid);
			q.setParameter("fid",fid);
			q.executeUpdate();
		return 1;
		}
		else
		{
			return 0;
		}
	}

	@Override
	public FoodBean viewFood(String foodId) {
		// TODO Auto-generated method stub
		int fid=Integer.parseInt(foodId);
		Query q=sessionFactory.getCurrentSession().createQuery("from FoodBean where foodID=:ff");
		q.setParameter("ff",fid);
		ArrayList al=new ArrayList();
		al=(ArrayList) q.list();
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			return (FoodBean)itr.next();
		}
		return null;
	}

	@Override
	public ArrayList<FoodBean> viewAllFood(String storeId) {
		// TODO Auto-generated method stub
		Query q=sessionFactory.getCurrentSession().createQuery("from FoodBean where storeID=:sid");
		q.setParameter("sid", storeId);
		return (ArrayList<FoodBean>) q.list();
	}

	@Override
	public String changeOrderStatus(String orderId, String val) {
		// TODO Auto-generated method stub
		Query i=sessionFactory.getCurrentSession().createQuery("update OrderBean set orderStatus='"+val+"' where orderID='"+orderId+"'");
		int j=i.executeUpdate();
		if(j==1) {return "Success";
			
		}else {
		return "Fail";}
	}

	
		
}

	
	