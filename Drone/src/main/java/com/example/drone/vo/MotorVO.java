package com.example.drone.vo;
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
}
