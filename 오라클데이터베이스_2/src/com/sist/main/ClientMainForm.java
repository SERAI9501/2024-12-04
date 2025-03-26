package com.sist.main;
//AcrylLookAndFeel 
import javax.swing.*;     
import java.awt.*;
import java.awt.event.*;
import com.sist.dao.*;
import com.sist.vo.*;
                             //상속=> 재사용=> 변경
public class ClientMainForm extends JFrame
implements ActionListener{
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
		
		cp.b1.addActionListener(this);//로그인 버튼
		cp.b2.addActionListener(this);//취소 버튼
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
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==cp.b2) 
		{
			System.exit(0);
		}
		else if(e.getSource()==cp.b1)//로그인
		{
			String id=cp.tf.getText();
			if(id.trim().length()<1)
			{
				cp.tf.requestFocus();
				return;
			}
			String pwd=String.valueOf(cp.pf.getPassword());
			if(pwd.trim().length()<1)
			{
				cp.pf.requestFocus();
				return;
			}
			MemberDAO dao=MemberDAO.newInstance();
			MemberVO vo=dao.isLogin(id,pwd);
			if(vo.getMsg().equals("NOID"))
			{
				JOptionPane.showMessageDialog(this, "아이디가 존재하지 않습니다");
				cp.tf.setText("");
				cp.pf.setText("");
				cp.tf.requestFocus();
			}
			else if(vo.getMsg().equals("NOPWD"))
			{
				JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다");
				cp.pf.setText("");
				cp.pf.requestFocus();
			}
			else // 로그인된 상태
			{
				String msg=vo.getName()+"님 로그인되었습니다\n"+"메인페이지로 이동합니다!!";
				JOptionPane.showMessageDialog(this, msg);
			}
		}
	}
}