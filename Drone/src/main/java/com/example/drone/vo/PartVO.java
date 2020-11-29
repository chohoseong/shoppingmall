package com.example.drone.vo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public  class PartVO {
	private int partNum;
	private String partName;
	private int price;
	private int horizontal;
	private int vertical;
	private int height;
	private int weight;
	

	public ArrayList<Field> attribute(){
		ArrayList<Field> fields = new ArrayList<Field>();
		fields.addAll(Arrays.asList(PartVO.class.getDeclaredFields()));
		fields.remove(0);
		return fields;
	}
	
	public ArrayList<Method> method(){
		ArrayList<Method> methods = new ArrayList<Method>();
		ArrayList<Field> fields = this.attribute();
		Method m[] = PartVO.class.getDeclaredMethods();
		
		for(int i=0;i<fields.size();i++) {
			String s =fields.get(i).getName();
			for(int j=0;j<m.length;j++) {
				if(m[j].getName().substring(3).equalsIgnoreCase(s)
						&& m[j].getName().substring(0, 3).equals("get") )
					methods.add(m[j]);
			}
		}
		return methods;
	}
	
}
