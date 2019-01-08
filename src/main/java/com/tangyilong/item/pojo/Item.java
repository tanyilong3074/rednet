package com.tangyilong.item.pojo;

import java.util.Date;

public class Item {
	public Long id;
	public String name;
	public double price;
	public String discrib;
	public Date createDate;
	public Item(Long id, String name, double price, String discrib, Date createDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discrib = discrib;
		this.createDate = createDate;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDiscrib() {
		return discrib;
	}
	public void setDiscrib(String discrib) {
		this.discrib = discrib;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", discrib=" + discrib + ", createDate="
				+ createDate + "]";
	}
}
