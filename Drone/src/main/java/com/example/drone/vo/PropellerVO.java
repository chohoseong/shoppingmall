package com.example.drone.vo;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter @Setter
public class PropellerVO extends PartVO {
	String material;
	String color;
}
