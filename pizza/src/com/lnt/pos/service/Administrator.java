package com.lnt.pos.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.lnt.pos.bean.CartBean;
import com.lnt.pos.bean.FoodBean;
import com.lnt.pos.bean.OrderBean;
import com.lnt.pos.bean.ProfileBean;
import com.lnt.pos.bean.StoreBean;
@Service
public interface Administrator {
    String addStore(StoreBean storebean);   
    boolean modifyStore(StoreBean storebean);     
    int removeStore(ArrayList<Integer> storeId);         
    StoreBean viewStore(String storeId);    
    ArrayList <StoreBean> viewAllStore();   
    String addFood(FoodBean foodbean, StoreBean storebean);    
    boolean modifyFood(FoodBean foodbean,StoreBean storebean);   
    //boolean removeFood(String storeId, String foodId);     
    int removeFood(ArrayList<Integer> storeId, ArrayList<Integer> foodId); 
    FoodBean viewFood(String foodId);    
    ArrayList<FoodBean> viewAllFood(String storeId);    
    ArrayList <FoodBean> viewAllFood(); 
    String changeOrderStatus(String orderId,String val);

 }
