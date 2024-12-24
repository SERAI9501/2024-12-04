package com.sist.map;
import java.util.*;
public class Container {
	private Map<String,Model> clsMap=
			new HashMap<String, Model>();
	public Container()
	{
		clsMap.put("board", new BoardModel());
		clsMap.put("recipe", new RecipeModel());
		clsMap.put("mypage", new MyPageModel());
		clsMap.put("food", FoodModel());
		clsMap.put(null, null)
	}
}
