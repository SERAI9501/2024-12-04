package com.sist.board;
import java.io.Serializable;
import java.util.*;

import lombok.Data;
/*
 *    => 파일 => ArrayList =>제어
 *    -------------------------
 *      1. Collection : 다수의 데이터를 저장하ㅏ고 제어하는 라이브러리
 *         ----------
 *            |
 *      ---------------------
 *      |         |          |
 *     List      Set       Map
 *      |         |          |
 *   ArrayList  HashSet    HashMap
 *                          =>웹에서 가장 많이 사용되는 라이브러리
 *                          => 키와 값
 *                          => 키는 중복(X)
 *                          => Mybasie
 *   ---------   => 중복이 없는 데이터
 *               => 순서가 없다
 *               => add() / remove() / size() / isEmpty
 *               => clear()
 *   1) add
 *   2) set
 *   3) remove()
 *   4) isEmpty()
 *   5) 데이터 중복이 가능
 *   6) 순서를 가지고 있다
 */
@Data
public class BoardVO implements Serializable{
	private int no;//게시물번호
	private String name;
	private String subject;
	private String content;
	private String pwd;//비밀번호
	private Date regdate;
	private int hit;
}
