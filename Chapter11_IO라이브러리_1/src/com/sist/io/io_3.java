package com.sist.io;
//listFile =>현재 폴더에 존자하는 파일이 캊아서요
import java.io.*;
public class io_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File dir=new File("c:\\javaDev");
        File[] list=dir.listFiles();
        for(File f:list)
        {
        	if(f.isFile())
        	{
        		String name=f.getName();
        		String ext=name.substring(name.lastIndexOf(".")+1);
        		System.out.println(name+" "+ext);
        	}
        }
        
	}

}