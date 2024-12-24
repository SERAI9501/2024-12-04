package com.sist.exam;
import java.util.*;
import java.net.*;

public class Server_Java implements Runnable{
	private Vector<Client> waitVc=new Vector<Client>();
	private ServerSocket ss;
	// => 예전 프로그램 유지보수 (Vector)
	public Server()
	{
		try
		{
			ss=new ServerSocket(3355);
			System.out.println("Server Start");
			
		}catch (Exception ex) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		Server 
	}
		// TODO Auto-generated method stub
	@Override
	public void run() {
		while(true)
		{
			try {
				Socket s=ss.accept();
				Client client=new Client(s);
			}catch (Exception ex) {
				// TODO: handle exception
			}
		}
		
	}
	class Client extends Thread
	{
		private Socket s;
		public Client(Socket s) {
			this.s=s;
			System.out.println(s.getInetAddress().getHostAddress());
			System.out.println(s.getPort());
		}
	}
}
