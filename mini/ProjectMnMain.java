package com.pj.mini;

import java.util.Random;
import java.util.Scanner;

public class ProjectMnMain {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		ProjectMn ob = new ProjectMnImpl();
		Random rd = new Random();
		int ch;
		
		Thread t = new Thread(new ProjectMnImpl());
		Thread co = new Thread(new cosme());

		
		co.start();

		try {
			co.join();
		} catch (Exception e) {
			// TODO: handle exception
		}

		ob.write();

		while(true) {

			do {
				System.out.println("\n=======================================================================================================================================================\n");
				System.out.println("                                                                      <�޴�>");
				System.out.print("\n                                               1.ȸ������         2.ȸ�� ���� Ȯ��         3.�̺�Ʈ ����");
				System.out.print("\n\n=======================================================================================================================================================\n");
				ch = sc.nextInt();
			}while(ch<1);

			switch (ch) {
			case 1: ob.input(); break;
			case 2: ob.print(); break;
			case 3: ob.event(); 
			
			System.out.println("\r\n" + 
					"\r\n" + 
					"                                     ,----                            \r\n" + 
					"                            *       =#@;~@                            \r\n" + 
					"                          ;@@@@-. :@@-  -@                            \r\n" + 
					"                          ~@!-;@#*@!-  :@*      !*.                   \r\n" + 
					"                      *-.. #@,  @@=   -@@@@...@@#!                    \r\n" + 
					"                      :#@@!!@@$!:@=:!#@#::@@@@;:                      \r\n" + 
					"                          ;@@@@@@@@@@~                                \r\n" + 
					"                    $@@@@@@@@@@@@@@@@@@@@@@@@@@-                      \r\n" + 
					"                   .##         #= -@$        ~@!                      \r\n" + 
					"                   .$#:::::::::#$:!@#::::::::!@!                      \r\n" + 
					"                    *@@@@@@@@@@@@@@@@@@@@@@@@@@                       \r\n" + 
					"                     .@@       #* -@$       @!                        \r\n" + 
					"                     .@@       #* -@$       @!                        \r\n" + 
					"                     .@@       #* -@$       @!                        \r\n" + 
					"                     .@@       #* -@$       @!                        \r\n" + 
					"                     .@@       #* -@$       @!                        \r\n" + 
					"                     .@@       #* -@$       @!                        \r\n" + 
					"                     .@@       #* -@$       @!                        \r\n" + 
					"                     .@@       #* -@$       @!                        \r\n" + 
					"                     .@@       #= -@$       @!                        \r\n" + 
					"                      -!@@@@@@@@@@@@@@@@@@@@;-                        \r\n" + 
					"                                                                      \r\n" + 
					"");

			System.out.print("              �αٵα� �����ڽ� ������ �� ");

			t.start();

			try {			
				Thread.sleep(500);			
			} catch (Exception e) {
				System.out.println(e.toString());
			}		

			try {
				t.join();				
			} catch (Exception e) {
				// TODO: handle exception
			}

			ob.ranran();
			ob.check();
			case 4: 
				System.out.println("������ ��忡 �����մϴ�.");
				System.out.println("<ȸ�� ���>");
				ob.writeFile(); break;
			default : System.out.println("���� �Է� ����!!");


			}			
		}
	}
}
