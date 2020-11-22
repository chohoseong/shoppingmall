package com.example.drone.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.example.drone.vo.PartVO;

@Mapper
public interface PartMapper {
	ArrayList<PartVO> selectallPart();
}
