package com.example.drone.vo;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class MemberRoleVO {
	private int rno;
	private String roleName;
	
	public MemberRoleVO() {}
	
	public MemberRoleVO(int rno, String roleName) {
			this.rno = rno;
			this.roleName=roleName;
	}
}
