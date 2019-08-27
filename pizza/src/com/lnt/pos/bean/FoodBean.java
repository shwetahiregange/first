package com.lnt.pos.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="POS_TBL_Food")
public class FoodBean {
	@Id
	@GeneratedValue
	@Column
private int foodID;
	@Column
private String name;
	@Column
private String type;
	@Column
private String foodSize;
	@Column
private int quantity;
	@Column
private double price;
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="storeID")
	private StoreBean sb;
	
	public StoreBean getSb() {
		return sb;
	}
	public void setSb(StoreBean sb) {
		this.sb = sb;
	}
	public int getFoodID() {
		return foodID;
	}
	public void setFoodID(int foodID) {
		this.foodID = foodID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFoodSize() {
		return foodSize;
	}
	public void setFoodSize(String foodSize) {
		this.foodSize = foodSize;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "FoodBean [foodID=" + foodID + ", name=" + name + ", type=" + type + ", foodSize=" + foodSize
				+ ", quantity=" + quantity + ", price=" + price + ", sb=" + sb + "]";
	}
	
}
