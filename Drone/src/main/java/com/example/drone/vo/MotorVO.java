package com.example.drone.vo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class MotorVO extends PartVO{
	int kv;
	int power;
	public int getKv() {
		return kv;
	}
	public void setKv(int kv) {
		this.kv = kv;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	ArrayList<MotorVO> selectallParts(){
		return partmapper.selectallMotor();
	}
	
	ArrayList<Field> getattribute(){
		ArrayList<Field> fields = new ArrayList<Field>();
		fields.addAll(super.getattribute());
		fields.addAll(Arrays.asList(MotorVO.class.getDeclaredFields()));
		return fields;
	}
}
