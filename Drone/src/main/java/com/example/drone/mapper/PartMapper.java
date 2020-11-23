package com.example.drone.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.example.drone.vo.BatteryVO;
import com.example.drone.vo.CameraVO;
import com.example.drone.vo.FrameVO;
import com.example.drone.vo.MotorVO;
import com.example.drone.vo.PartVO;
import com.example.drone.vo.PropellerVO;

@Mapper
public interface PartMapper {
	ArrayList<PartVO> selectallPart();
	ArrayList<FrameVO> selectallFrame();
	ArrayList<BatteryVO> selectallBattery();
	ArrayList<CameraVO> selectallCamera();
	ArrayList<MotorVO> selectallMotor();
	ArrayList<PropellerVO> selectallPropeller();
}
