package com.sist.client;
//AcrylLookAndFeel 
import javax.swing.*;     
                             //상속=> 재사용=> 변경
public class ClientMainForm extends JFrame{
	MenuForm mf=new MenuForm();//포함 클래스 => 있는 그대로 가져오는 것
	ControlPanel cp=new ControlPanel();
	//배치
	public ClientMainForm()
	{
		setLayout(null);//사용자 정의 => 직접 배치
		mf.setBounds(220, 15, 800, 50);
		add(mf);
		cp.setBounds(10, 75, 1250, 605);
		add(cp);
		setSize(1280,720);
		setVisible(true);
	}
	public static void main(String[] args) {
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		}catch (Exception ex) {
			// TODO: handle exception
		}
		new ClientMainForm();
}
}