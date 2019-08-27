package com.lnt.pos.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.lnt.pos.bean.CartBean;
import com.lnt.pos.bean.CredentialsBean;
import com.lnt.pos.bean.CreditcardBean;
import com.lnt.pos.bean.FoodBean;
import com.lnt.pos.bean.OrderBean;
import com.lnt.pos.bean.ProfileBean;
import com.lnt.pos.bean.StoreBean;
import com.lnt.pos.dao.CustDao;

public class CustomerImpl implements Customer{
	@Autowired
	private CustDao cdao;
	@Transactional
	@Override
	public String getProfile(ProfileBean pb) {
		// TODO Auto-generated method stub
		return cdao.getProfile(pb);
	}
	@Transactional
	@Override
	public String addCredential(CredentialsBean cb, ProfileBean pb) {
		// TODO Auto-generated method stub
		return cdao.addCredential(cb, pb);
	}
	@Transactional
	@Override
	public String addToCart(CartBean cartbean, ProfileBean profilebean,FoodBean foodbean) {
		// TODO Auto-generated method stub
		return cdao.addToCart(cartbean, profilebean, foodbean);
	}
	@Transactional
	@Override
	public ArrayList<FoodBean> viewAllFood() {
		// TODO Auto-generated method stub
		return cdao.viewAllFood();
	}
	@Transactional
	@Override
	public ArrayList<ProfileBean> viewProfile() {
		// TODO Auto-generated method stub
		return cdao.viewProfile();
	}
	@Transactional
	@Override
	public ArrayList<StoreBean> viewAllStore() {
		// TODO Auto-generated method stub
		return cdao.viewAllStore();
	}
	@Transactional
	@Override
	public ArrayList<CartBean> viewCart(String userId) {
		// TODO Auto-generated method stub
		return cdao.viewCart(userId);
	}
	@Transactional
	@Override
	public boolean modifyCart(CartBean cartbean, ProfileBean profilebean,FoodBean foodbean) {
		// TODO Auto-generated method stub
		return cdao.modifyCart(cartbean, profilebean, foodbean);
	}
	@Transactional
	@Override
	public int removeCart(ArrayList<Integer> userId, ArrayList<Integer> cartId) {
		// TODO Auto-generated method stub
		return cdao.removeCart(userId, cartId);
	}
	@Transactional
	@Override
	public String confirmOrder(OrderBean orderbean, CartBean cartbean, ProfileBean profilebean,
			StoreBean storebean) {
		// TODO Auto-generated method stub
		return cdao.confirmOrder(orderbean, cartbean, profilebean, storebean);
	}
	@Transactional
	@Override
	public ArrayList<CartBean> viewAllCart() {
		// TODO Auto-generated method stub
		return cdao.viewAllCart();
	}
	@Transactional
	@Override
	public int cancelOrder(ArrayList<Integer> orderId) {
		// TODO Auto-generated method stub
		return cdao.cancelOrder(orderId);
	}
	@Transactional
	@Override
	public ArrayList<OrderBean> viewAllOrder() {
		// TODO Auto-generated method stub
		return cdao.viewAllOrder();
	}
	@Transactional
	@Override
	public String addPayment(CreditcardBean ccb, OrderBean ob) {
		// TODO Auto-generated method stub
		return cdao.addPayment(ccb, ob);
	}
}
