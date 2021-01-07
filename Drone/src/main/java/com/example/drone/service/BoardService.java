package com.example.drone.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.drone.mapper.BoardMapper;
import com.example.drone.vo.BoardVO;

@Service
public class BoardService {
	@Autowired
	BoardMapper boardmapper;
	
	public ArrayList<BoardVO> selectallQuestion() {
		return boardmapper.selectallQuestion();		
	}
}
