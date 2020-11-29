package com.example.drone.vo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Setter @Getter
public class MotorVO extends PartVO{
	int kv;
	int power;
	
	
	public ArrayList<Field> attribute(){
		ArrayList<Field> fields = new ArrayList<Field>();
		fields.addAll(super.attribute());
		fields.addAll(Arrays.asList(MotorVO.class.getDeclaredFields()));
		return fields;
	}
	
	public ArrayList<Method> method(){
		ArrayList<Method> methods = new ArrayList<Method>();
		ArrayList<Field> fields = new ArrayList<Field>();
		fields.addAll(Arrays.asList(MotorVO.class.getDeclaredFields()));
		Method m[] = MotorVO.class.getDeclaredMethods();
		methods.addAll(super.method());
		
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
