package com.lnt.pos.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.lnt.pos.bean.FoodBean;
import com.lnt.pos.bean.OrderBean;
import com.lnt.pos.bean.StoreBean;
import com.lnt.pos.dao.AdminDao;

public class AdministratorImpl implements Administrator{
	@Autowired
	private AdminDao adao;
	@Transactional
	@Override
	public String addStore(StoreBean storebean) {
		// TODO Auto-generated method stub
		return adao.addStore(storebean);
	}
	@Transactional
	@Override
	public boolean modifyStore(StoreBean storebean) {
		// TODO Auto-generated method stub
		return adao.modifyStore(storebean);
	}
	@Transactional
	@Override
	public int removeStore(ArrayList<Integer> storeId) {
		// TODO Auto-generated method stub
		return adao.removeStore(storeId);
	}
	@Transactional
	@Override
	public StoreBean viewStore(String storeId) {
		// TODO Auto-generated method stub
		return adao.viewStore(storeId);
	}
	@Transactional
	@Override
	public ArrayList<StoreBean> viewAllStore() {
		// TODO Auto-generated method stub
		return adao.viewAllStore();
	}
	@Transactional
	@Override
	public ArrayList<FoodBean> viewAllFood() {
		// TODO Auto-generated method stub
		return adao.viewAllFood();
	}
	
	
	
	@Transactional
	@Override
	public FoodBean viewFood(String foodId) {
		// TODO Auto-generated method stub
		return adao.viewFood(foodId);
	}
	@Transactional
	@Override
	public ArrayList<FoodBean> viewAllFood(String storeId) {
		// TODO Auto-generated method stub
		return adao.viewAllFood(storeId);
	}
	@Transactional
	@Override
	public String addFood(FoodBean foodbean, StoreBean storebean) {
		// TODO Auto-generated method stub
		
		return adao.addFood(foodbean, storebean);
	}
	@Transactional
	@Override
	public boolean modifyFood(FoodBean foodbean, StoreBean storebean) {
		// TODO Auto-generated method stub
		return adao.modifyFood(foodbean,storebean);
	}
	@Transactional
	@Override
	public int removeFood(ArrayList<Integer> storeId, ArrayList<Integer> foodId) {
		// TODO Auto-generated method stub
		return adao.removeFood(storeId, foodId);
	}
	@Transactional
	@Override
	public String changeOrderStatus(String orderId, String val) {
		// TODO Auto-generated method stub
		return adao.changeOrderStatus(orderId, val);
	}
	
	

}
