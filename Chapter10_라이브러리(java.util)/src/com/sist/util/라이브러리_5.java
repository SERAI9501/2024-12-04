package com.sist.util;
import java.util.*;
import java.text.*;
public class 라이브러리_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-M-d");
		String today=sdf.format(date);
		StringTokenizer st=new StringTokenizer(today,"-");
		int year=Integer.parseInt(st.nextToken());
		int month=Integer.parseInt(st.nextToken());
		int day=Integer.parseInt(st.nextToken());
		
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month);
		cal.set(Calendar.DATE,day);
		
		int week=cal.get(Calendar.DAY_OF_WEEK);
		String[] strWeek= {"","일","월","화","수","목","금","토"};
		System.out.println(year+"년도 "+month+"월 "+day+"일은 "+strWeek[week]+"요일입니다");
	}

}
