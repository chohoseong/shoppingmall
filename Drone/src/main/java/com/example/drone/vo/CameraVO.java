package com.example.drone.vo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class CameraVO extends PartVO{
	String lens;
	int pixel;
	
	public String getLens() {
		return lens;
	}
	public void setLens(String lens) {
		this.lens = lens;
	}
	public int getPixel() {
		return pixel;
	}
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	
	ArrayList<CameraVO> selectallParts(){
		return partmapper.selectallCamera();
	}
	
	ArrayList<Field> getattribute(){
		ArrayList<Field> fields = new ArrayList<Field>();
		fields.addAll(super.getattribute());
		fields.addAll(Arrays.asList(CameraVO.class.getDeclaredFields()));
		return fields;
	}
}
