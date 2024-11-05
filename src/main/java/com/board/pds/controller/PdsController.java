package com.board.pds.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.board.pds.service.PdsService;
import com.board.pds.vo.PdsVo;

@Controller
@RequestMapping("/Pds")
public class PdsController {
	
	@Autowired
	private PdsService pdsService;
	
	//"/Pds/List?nowpage=1&menu_id=MENU01"
	@RequestMapping("/List")
	public ModelAndView list( @RequestParam HashMap<String, Object> map ) {
		//전부 맵으로 받으면 모든게 맵으로 반복되면서 새로운 데이터가 추가되더라도 인자처리에 유용하게 된다.
		
		//자료실 목록 준비
		//map.put(null, map); //파라미터 더 집어넣을때
		List<PdsVo> pdsList = pdsService.getPdsList( map );
		ModelAndView mv = new ModelAndView();
		System.out.println( map );
		mv.addObject( "pdsList", pdsList );
		mv.addObject( "map", map );
		mv.setViewName( "pds/list" );
		return mv;
	}
}
