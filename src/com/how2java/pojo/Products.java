package com.how2java.pojo;

public class Products {
	//定义数据实体的列名
	private int id;
	private String name;
	private String brand;
	private String type;
	private String unit;
	private Double price;
	
	//定义get 和set方法
	
	public int getId() {
		return id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", brand=" + brand + ", type=" + type + ", unit=" + unit
				+ ", price=" + price + "]";
	}
	
	//重写toString方法
	

}
