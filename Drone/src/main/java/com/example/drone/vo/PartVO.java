package com.example.drone.vo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.drone.mapper.PartMapper;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public  class PartVO {
	private int partNum;
	private String partName;
	private int price;
	private int horizontal;
	private int vertical;
	private int height;
	private int weight;
	
	@Autowired
	protected PartMapper partmapper;
	
	ArrayList<Field> getattribute(){
		ArrayList<Field> fields = new ArrayList<Field>();
		fields.addAll(Arrays.asList(PartVO.class.getDeclaredFields()));
		return fields;
	}
	
}
