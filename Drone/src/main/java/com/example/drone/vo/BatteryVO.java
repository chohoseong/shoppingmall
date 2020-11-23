package com.example.drone.vo;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter @Setter
public class BatteryVO extends PartVO{
	int capacity;
	int voltage;

}
