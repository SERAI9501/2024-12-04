package com.sist.controller;
import com.sist.model.*;
import java.util.*;

/*
 *  사용자 요청 ==> Controller <=====> Model
 *                                 BoardList
 *                                 BoradDelete
 *                                 BoardDetail
 *                                 BoardUpdate
 *                                 BoardFind
 *   => 처리
 */
public class Controller {
public void service(String cmd)
{
	Map map=new HashMap();
	map.put("list", new BoardList());
	map.put("delete", new BoardDetail())
	map.put("detail", new Board)
	
	Model model=(model)map.get(cmd);
	model.excute();
//	if(cmd.equals("list")) {
//		Board
//	}
//	else if(cmd.equals("delete"))
//	{
//		Board
//	}
//	else if(cmd.equals("detail"))
//	{
//		
//	}
//	else if(cmd.equals("update"))
//	{
//		
//	}
//	else if(cmd.equals("find"))
//	{
//		BoradFind
//	}
		
}
}
