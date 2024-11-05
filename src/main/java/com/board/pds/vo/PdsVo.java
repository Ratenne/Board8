package com.board.pds.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //기본생성자
@AllArgsConstructor //인자있는 전체생성자
public class PdsVo {
	
	//Board 자료
	private int idx;
	private String title;
	private String content;
	private String writer;
	private String regdate;
	private int hit;
	
	//Files 자료
	
	private int filescount;

	//Menus자료
	private String menu_id;
	private String menu_name;
	private String menu_seq;
	
	

}
