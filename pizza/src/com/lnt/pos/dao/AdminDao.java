package com.lnt.pos.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.lnt.pos.bean.CartBean;
import com.lnt.pos.bean.FoodBean;
import com.lnt.pos.bean.OrderBean;
import com.lnt.pos.bean.ProfileBean;
import com.lnt.pos.bean.StoreBean;

@Repository
public interface AdminDao {
	 	String addStore(StoreBean storebean);   
	    boolean modifyStore(StoreBean storebean);     
	    int removeStore(ArrayList<Integer> storeId);         
	    StoreBean viewStore(String storeId);    
	    ArrayList <StoreBean> viewAllStore();   
	    String addFood(FoodBean foodbean, StoreBean storebean);    
	    boolean modifyFood(FoodBean foodbean,StoreBean storebean); 
	    int removeFood(ArrayList<Integer> storeId, ArrayList<Integer> foodId);     
	    FoodBean viewFood(String foodId);    
	    ArrayList<FoodBean> viewAllFood(String storeId);   
	    ArrayList <FoodBean> viewAllFood(); 
	    String changeOrderStatus(String orderId,String val);
	    
}


