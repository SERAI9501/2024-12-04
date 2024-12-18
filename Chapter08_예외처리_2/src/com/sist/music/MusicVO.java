package com.sist.music;
import lombok.Data;


// 캡슐화 => 데이터 보호
//VO가 들어갔단건 데이터를 모아서 전송할 목적이다
@Data
public class MusicVO {
	private String title;
	private String singer;
	private String album;
	//사용자가 연결 => getter/setter
}
