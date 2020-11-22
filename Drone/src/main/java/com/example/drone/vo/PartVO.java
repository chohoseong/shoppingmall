package com.example.drone.vo;

import org.springframework.stereotype.Component;


@Component
public class PartVO {
	private int partNum;
	private String partName;
	private int price;
	private int horizontal;
	private int vertical;
	private int height;
	private int weight;
	public int getPartNum() {
		return partNum;
	}
	public void setPartNum(int partNum) {
		this.partNum = partNum;
	}
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getHorizontal() {
		return horizontal;
	}
	public void setHorizontal(int horizontal) {
		this.horizontal = horizontal;
	}
	public int getVertical() {
		return vertical;
	}
	public void setVertical(int vertical) {
		this.vertical = vertical;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
