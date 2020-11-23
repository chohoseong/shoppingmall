package com.example.drone.vo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class FrameVO extends PartVO{
	int armLength;
	String color;
	public int getArmLength() {
		return armLength;
	}
	public void setArmLength(int armLength) {
		this.armLength = armLength;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	ArrayList<FrameVO> selectallParts(){
		return partmapper.selectallFrame();
	}
	
	ArrayList<Field> getattribute(){
		ArrayList<Field> fields = new ArrayList<Field>();
		fields.addAll(super.getattribute());
		fields.addAll(Arrays.asList(FrameVO.class.getDeclaredFields()));
		return fields;
	}
}
