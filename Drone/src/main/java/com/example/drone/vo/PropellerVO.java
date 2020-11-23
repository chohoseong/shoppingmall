package com.example.drone.vo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter @Setter
public class PropellerVO extends PartVO {
	String material;
	String color;
	
	ArrayList<PropellerVO> selectallParts(){
		return partmapper.selectallPropeller();
	}
	
	ArrayList<Field> getattribute(){
		ArrayList<Field> fields = new ArrayList<Field>();
		fields.addAll(super.getattribute());
		fields.addAll(Arrays.asList(PropellerVO.class.getDeclaredFields()));
		return fields;
	}
}
