package com.sist.main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class 네트워크_2 extends JFrame 
implements ActionListener{
	JProgressBar[] bar=new JProgressBar[5];
	JButton b1,b2;
	
	static int rank;
	public 네트워크_2()
	{
		b1=new JButton("시작");
		b2=new JButton("종료");
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(5, 1, 1, 5));
		Color[] color= {
				Color.yellow,
				Color.magenta,
				Color.orange,
				Color.pink,
				Color.cyan
		};
		for(int i=0;i<5;i++)
		{
			bar[i]=new JProgressBar();
			bar[i].setBackground(Color.white);
			bar[i].setForeground();
		}
		JPanel p2=new JPanel();
		p2.add(b1);
		p2.add(b2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==b1)
		{
			for(int i=0;i<5;i++)
			{
				bt[i]=new BarThread(i);
				bt[i].satrt();
						
			}
		}
	// 내부 클래스 = 멤버클래스 라고 부른다 = 클레스에 있는 모든 내용을 공유 할 수 있다.
	// -------- 쓰레드 / 네트워크 / 빅데이터
	/*
	 *  class A
	 *  {
	 *      -------
	 *       A 데이터
	 *      -------
	 *      class B
	 *      ()필요시마다  A데이터를 사용할 수 있다
	 *      => 객체선언 없이 사용이 가능
	 */
	class BarThread extends Thread
	{
		// 프로그래바 한개만 작동
		int index;
		public BarThread(int index)
		{
			this.index=index;
		}
		public void run()
		{
		try
		{
			for(int i=0;i<=100;i++)
			{
				bar[index].setValue(i);
				//bar => 실제 값
				int a=(int)(Math.random()*300);
				Thread.sleep(a);
				if(i==100)
				{
					rank++;
					interrupt();
				}
						
			}
			System.out.println();
		}catch (Exception ex) {
			// TODO: handle exception
		}
		
	}
}
}
