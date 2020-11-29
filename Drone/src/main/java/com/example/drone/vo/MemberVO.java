package com.example.drone.vo;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Setter @Getter
public class MemberVO {
	private String userId;
	private String userName;
	private String phoneNum;
	private String userPass;
	private String email;
	private String address;
	private MemberRoleVO role;
		
}
