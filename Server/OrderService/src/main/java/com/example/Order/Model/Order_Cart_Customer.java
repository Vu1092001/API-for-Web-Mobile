package com.example.Order.Model;

import java.io.Serializable;

import com.example.Order.Entity.OrderO;

public class Order_Cart_Customer implements Serializable{
	private OrderO order;
	private Cart cart;
	private Customer customer;
	public OrderO getOrder() {
		return order;
	}
	public void setOrder(OrderO order) {
		this.order = order;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Order_Cart_Customer(OrderO order, Cart cart, Customer customer) {
		super();
		this.order = order;
		this.cart = cart;
		this.customer = customer;
	}
	public Order_Cart_Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Order_Cart_Customer [order=" + order + ", cart=" + cart + ", customer=" + customer + "]";
	}
	
	
	
}
