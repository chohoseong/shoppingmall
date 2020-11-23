package com.example.drone.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.drone.mapper.PartMapper;
import com.example.drone.vo.BatteryVO;
import com.example.drone.vo.CameraVO;
import com.example.drone.vo.FrameVO;
import com.example.drone.vo.MotorVO;
import com.example.drone.vo.PropellerVO;

@Service
public class PartService {
	@Autowired
	private PartMapper partmapper;
	
	
	public ArrayList<FrameVO> selectallFrame() {
		return partmapper.selectallFrame();		
	}
	public ArrayList<BatteryVO> selectallBattery() {
		return partmapper.selectallBattery();		
	}
	public ArrayList<CameraVO> selectallCamera() {
		return partmapper.selectallCamera();		
	}
	public ArrayList<MotorVO> selectallMotor() {
		return partmapper.selectallMotor();		
	}
	public ArrayList<PropellerVO> selectallPropeller() {
		return partmapper.selectallPropeller();		
	}
	
	
}
