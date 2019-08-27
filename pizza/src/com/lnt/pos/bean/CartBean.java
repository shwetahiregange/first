package com.lnt.pos.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.lnt.pos.bean.CredentialsBean;
import com.lnt.pos.bean.FoodBean;
@Entity
@Table(name=" POS_TBL_Cart")
public class CartBean {
	@Id
	@GeneratedValue
	@Column
	private int cartID;
	@Column
	private int quantity;
	@Column
	private double cost;
	@Column
	private String orderDate;
	@Column
	private String foodSize;
	@Column
	private String name;
    @OneToOne(cascade=CascadeType.MERGE)
   	@JoinColumn(name="userID")
   	private ProfileBean pb;
    @OneToOne(cascade=CascadeType.MERGE)
   	@JoinColumn(name="foodID")
   	private FoodBean fb;
    
		
		public FoodBean getFb() {
		return fb;
	}
	public void setFb(FoodBean fb) {
		this.fb = fb;
	}
		public ProfileBean getPb() {
		return pb;
	}
	public void setPb(ProfileBean pb) {
		this.pb = pb;
	}
	
		public String getFoodSize() {
			return foodSize;
		}
		public void setFoodSize(String foodsize) {
			this.foodSize = foodsize;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	
		public int getCartID() {
			return cartID;
		}
		public void setCartID(int cartID) {
			this.cartID = cartID;
		}
		
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getCost() {
			return cost;
		}
		public void setCost(double cost) {
			this.cost = cost;
		}
		public String getOrderDate() {
			return orderDate;
		}
		public void setOrderDate(String orderDate) {
			this.orderDate = orderDate;
		}
		
	}
