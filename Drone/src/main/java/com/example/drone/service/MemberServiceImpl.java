package com.example.drone.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.drone.mapper.MemberMapper;
import com.example.drone.vo.MemberPrincipalVO;
import com.example.drone.vo.MemberRoleVO;
import com.example.drone.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
		
        //DB로부터 회원 정보를 가져온다.
		ArrayList<MemberVO> userAuthes = memberMapper.findByMemberId(id);
		MemberRoleVO mrv = memberMapper.findRole(id);
		userAuthes.get(0).setRole(mrv);
		if(userAuthes.size() == 0) {
			throw new UsernameNotFoundException("User "+id+" Not Found!");
		}
		
		return new MemberPrincipalVO(userAuthes); //UserDetails 클래스를 상속받은 UserPrincipalVO 리턴한다.
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
	public String InsertUser(MemberVO userVO) {
		MemberRoleVO mrv = new MemberRoleVO(2,"USER");
		userVO.setUserPass(bCryptPasswordEncoder.encode(userVO.getUserPass()));
		userVO.setRole(mrv);
		int flag = memberMapper.memberSave(userVO);		
		if (flag > 0) {

			return "success";
		}	 	
		return "fail";
	}
}
