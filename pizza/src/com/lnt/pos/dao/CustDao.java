package com.lnt.pos.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.lnt.pos.bean.CartBean;
import com.lnt.pos.bean.CredentialsBean;
import com.lnt.pos.bean.CreditcardBean;
import com.lnt.pos.bean.FoodBean;
import com.lnt.pos.bean.OrderBean;
import com.lnt.pos.bean.ProfileBean;
import com.lnt.pos.bean.StoreBean;

@Repository
public interface CustDao {
	String getProfile(ProfileBean pb);
    String addCredential(CredentialsBean cb,ProfileBean pb);
    String addToCart(CartBean cartbean, ProfileBean profilebean,FoodBean foodbean); 
    ArrayList<CartBean> viewCart(String userId);
    boolean modifyCart(CartBean cartbean,ProfileBean profilebean,FoodBean foodbean);
    int removeCart(ArrayList<Integer> userId, ArrayList<Integer> cartId);
    String confirmOrder(OrderBean orderbean,CartBean cartbean,ProfileBean profilebean,StoreBean storebean );
    int cancelOrder(ArrayList<Integer> orderId);   
    ArrayList <OrderBean> viewAllOrder();
    ArrayList <FoodBean> viewAllFood();
    ArrayList <ProfileBean> viewProfile();
    ArrayList <StoreBean> viewAllStore(); 
    ArrayList <CartBean> viewAllCart();
    String addPayment(CreditcardBean ccb,OrderBean ob);
}
