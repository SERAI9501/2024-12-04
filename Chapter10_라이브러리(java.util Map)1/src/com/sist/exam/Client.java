package com.sist.exam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
//tf => 입력후에 데이터를 => 서버
// 서버에서 들어오는 데이터를 읽기 => ta
// ta,tf의 단점은 단방향이다 그래서 양방향으로 바꿀 필요가 있다
// => 쓰레드 처리는 두가지를 동시에 처리가 가능하다
/*
 *  Vue / React
 *         | 단방향
 *  | 양방향
 */
public class Client extends JFrame implements ActionListener,Runnable{
	JButton b1,b2;
	JTextField tf,tf2;
	JTextArea ta;
	public Client()
	{
		b1=new JButton("접속");
		b2=new JButton("종료");
		tf2=new JTextField(10);
		tf=new JTextField();
		ta=new JTextArea();
		ta.setEditable(false);
		JScrollPane js=new JScrollPane(ta);
		setLayout(null);
		JPanel p=new JPanel();
		p.add(tf2);
		p.add(b1);
		p.add(b2);
		
		p.setBounds(10, 15, 450, 35);
		add(p);
		
		js.setBounds(10, 55, 450, 200);
		
		add(js);
		
		tf.setBounds(10, 260, 450, 30);
		add(tf);
		
		setSize(490,350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		b1.addActionListener(this);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			try
			{
				Socket s=new Socket("localhost",3355);
			}catch (Exception ex) {
				// TODO: handle exception
			}
		}
	}

}
