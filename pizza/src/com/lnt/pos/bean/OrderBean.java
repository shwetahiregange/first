package com.lnt.pos.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.lnt.pos.bean.CartBean;
import com.lnt.pos.bean.StoreBean;
@Entity
@Table(name="POS_TBL_Order")
public class OrderBean {
	@Id
	@GeneratedValue
	@Column
	private int orderID;
	
	//private String userID;
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="userID")
	private ProfileBean pb;
	@Column
	private String orderDate;
	//private String storeID;
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="storeID")
	private StoreBean sb;
	
	//private int cartID;
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="cartID")
	private CartBean cb;
	@Column
	private double totalPrice;
	@Column
	private String orderStatus;
	@Column
	private String street;
	@Column
	private String 	city;
	@Column
	private String state;
	@Column
	private String pincode;
	@Column
	private String 	mobileNo;
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public CartBean getCb() {
		return cb;
	}
	public void setCb(CartBean cb) {
		this.cb = cb;
	}
	public ProfileBean getPb() {
		return pb;
	}
	public void setPb(ProfileBean pb) {
		this.pb = pb;
	}
	
	
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public StoreBean getSb() {
		return sb;
	}
	public void setSb(StoreBean sb) {
		this.sb = sb;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "OrderBean [orderID=" + orderID + ", pb=" + pb + ", orderDate=" + orderDate + ", sb=" + sb + ", cb=" + cb
				+ ", totalPrice=" + totalPrice + ", orderStatus=" + orderStatus + ", street=" + street + ", city="
				+ city + ", state=" + state + ", pincode=" + pincode + ", mobileNo=" + mobileNo + "]";
	}

	}
