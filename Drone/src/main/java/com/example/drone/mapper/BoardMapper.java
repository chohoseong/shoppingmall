package com.example.drone.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.example.drone.vo.BoardVO;

@Mapper
public interface BoardMapper {
	ArrayList<BoardVO> selectallQuestion();

}
