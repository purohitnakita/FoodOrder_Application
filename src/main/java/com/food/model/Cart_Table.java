package com.food.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart_table")
public class Cart_Table {
	@Id
	private int cart_id;
	private String dish_name;
	private int quantity;
	private float price;
	private String date_of_insert;

	public Cart_Table() {
		super();
	}

	public Cart_Table(int cart_id, String dish_name, int quantity, long price) {
		super();
		this.cart_id = cart_id;
		this.dish_name = dish_name;
		this.quantity = quantity;
		this.price = price;
	}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public String getDish_name() {
		return dish_name;
	}

	public void setDish_name(String dish_name) {
		this.dish_name = dish_name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cart_Table [cart_id=" + cart_id + ", dish_name=" + dish_name + ",  quantity=" + quantity + ", price=" + price + ", date_of_insert=" + date_of_insert + "]";
	}

	public String getDate_of_insert() {
		return date_of_insert;
	}

	public void setDate_of_insert(String date_of_insert) {
		this.date_of_insert = date_of_insert;
	}

}
