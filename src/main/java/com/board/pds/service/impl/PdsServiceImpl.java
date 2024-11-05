package com.board.pds.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.pds.mapper.PdsMapper;
import com.board.pds.service.PdsService;
import com.board.pds.vo.PdsVo;

@Service //중요
public class PdsServiceImpl implements PdsService{

	@Autowired
	private PdsMapper pdsMapper;
	
	@Override
	public List<PdsVo> getPdsList(HashMap<String, Object> map) {
		//인터페이스 PdsService대신 서비스에 해당하는 코드를 넣게 해줌
		
		List<PdsVo> pdsList = pdsMapper.getPdsList(  map  );
		return pdsList;
	}

}
