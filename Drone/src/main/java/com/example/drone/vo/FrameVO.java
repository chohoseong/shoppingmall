package com.example.drone.vo;
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
}
