package com.example.drone.vo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class PartVO {
	private int partNum;
	private String partName;
	private int price;
	private int horizontal;
	private int vertical;
	private int height;
	private int weight;
	
}
