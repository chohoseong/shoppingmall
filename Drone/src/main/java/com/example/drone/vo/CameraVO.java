package com.example.drone.vo;
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
}
