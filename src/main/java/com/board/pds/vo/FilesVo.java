package com.board.pds.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //기본생성자
@AllArgsConstructor //인자있는 전체생성자
public class FilesVo {
	
	//Board 자료
	private int file_num;
	private int idx;
	private String filename;
	private String fileext;
	private String sfilename;
	
	

}
