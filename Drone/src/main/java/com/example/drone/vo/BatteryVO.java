package com.example.drone.vo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter @Setter
public class BatteryVO extends PartVO{
	int capacity;
	int voltage;
	
	ArrayList<BatteryVO> selectallParts(){
		return partmapper.selectallBattery();
	}
	
	ArrayList<Field> getattribute(){
		ArrayList<Field> fields = new ArrayList<Field>();
		fields.addAll(super.getattribute());
		fields.addAll(Arrays.asList(BatteryVO.class.getDeclaredFields()));
		return fields;
	}
}
