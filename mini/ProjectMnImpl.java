package com.pj.mini;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import com.day16.test.ScoreVO;


public class ProjectMnImpl implements ProjectMn,Runnable{


	Scanner sc = new Scanner(System.in);

	private ArrayList<ProjectMnVO>lists;

	private File ff = new File("C:\\doc\\peple.txt.txt");


	public ProjectMnImpl() {
		try {
			if(!ff.getParentFile().exists()) { 
				ff.getParentFile().mkdir();
			}
			if(ff.exists()) {
				FileInputStream fis = new FileInputStream(ff);
				ObjectInputStream ois = new ObjectInputStream(fis);

				lists = (ArrayList<ProjectMnVO>)ois.readObject();
				fis.close();
				ois.close();
			}

		}catch (Exception e) {
			// TODO: handle exception
		}	
	}

	ProjectMnVO pj = new ProjectMnVO();
	int num[];
	int type;

	private static String[] cos = {"���̽�����", "���̶��̳�","����ī��","����ƽ"};
	String[] fd = {"CoolMatt", "CoolGlow", "WarmMatt", "WarmGlow"};

	String[] boxImages = new String[2];
	int cnt = 0;


	class cosme implements Runnable{

		public void run() {

			String[] art = new String[38];
			art[0] = "                                                                                                                                                       \r\n";
			art[1] = "                                                                                                                                                       \r\n";
			art[2] = "                                                                                                                                                       \r\n";
			art[3] = "                                                                                                                                                       \r\n";
			art[4] = "			        -$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@=                                                  \r\n" ; 
			art[5] = " 			       *~                                                                                 ,=*                                                \r\n" ; 
			art[6] = "     			      ;#-       ��                  ��         ��                ��                         -!.                                              \r\n" ; 
			art[7] = "			    .=*                                                                           ��         =-                                             \r\n" ; 
			art[8] = " 			   ,=                    ��                                                              ��   -$,                                           \r\n" ; 
			art[9] = "			  .@*                                                  ��          ��                          =~                                           \r\n" ; 
			art[10] = "			 -$     ��                        ��         ��                                 ��               $,                                         \r\n" ; 
			art[11] = "			.@;            ��                                                                                *!                                         \r\n" ; 
			art[12] = "			~=                   ��        ��                         ��          ��                          #-                                        \r\n" ; 
			art[13] = "			@-                                                                                         ��     !$                                        \r\n" ; 
			art[14] = "			:#              :~              ~:-     ��       ~:              ~:              -:~              #:                                        \r\n" ; 
			art[15] = "			!@:    ��     ,:@!;~           :@!$:           :;!@:           .:@!;:      ��   :$!@:           ~;!;                                        \r\n" ; 
			art[16] = "			 ;;!:.      -;=;: ;#;~       :;!; ;=;:       ~;@; ;;!;,      ,;*;: ;@;:       ~;*; ;*;:       ~;#!.                                         \r\n" ; 
			art[17] = " 			  :;=!!!!!!$;:    :;#!!!!!!!!:.   -:*!!!!!!!$;:    :;=!!!!!!=;:    :;#!!!!!!!!:,   ,:!!!!!!!!$!:                                           \r\n" ; 
			art[18] = " 			   .~~~~~~$!.       ~~~~~~~~.       ,~~~~~~~-        ~~~~~~~~.       ~~~~~~~~,       .~;=~~~~~.            !@@-                           \r\n" ; 
			art[19] = "			         =~                                                                           ~*                  !@@@-                           \r\n" ; 
			art[20] = "  			         =~                   ___  _____  _____    ___  _____  _____                  ~*                !@@@@@-                           \r\n" ; 
			art[21] = "   	 		         =~                  |_  ||  _  ||  _  |  |_  ||  _  ||  _  |                 ~*               !@@@@@@@-                          \r\n" ; 
			art[22] = " 			         =~                    | || | | || | | |    | || | | || | | |                 ~*              *!@@@@@@@-                          \r\n" ; 
			art[23] = "          		         =~                    | || | | || | | |    | || | | || | | |                 ~*              :@@@@@@@@-                          \r\n" ; 
			art[24] = "         		         =~                /\\__/ /\\ \\_/ /\\ \\_/ //\\__/ /\\ \\_/ /\\ \\_/ /                 ~*             :@@@@@@@@@-                \r\n" ; 
			art[25] = "         		         =~                \\____/  \\___/  \\___/ \\____/  \\___/  \\___/                  ~*             :@@@@@@@@@-                       \r\n" ; 
			art[26] = "        			 =~                                                                           ~*           ~.,---------,..~                       \r\n" ; 
			art[27] = "        			 =~                                                                           ~*           ~              :                       \r\n" ; 
			art[28] = "        			 =~           _____  _____  _____ ___  ___ _____  _____  _____  _____         ~*           ~              :                       \r\n" ; 
			art[29] = "        			 =~          /  __ \\|  _  |/  ___||  \\/  ||  ___||_   _||_   _|/  __ \\        ~*           ~              :                    \r\n" ; 
			art[30] = "        			 =~          | /  \\/| | | |\\ `--. | .  . || |__    | |    | |  | /  \\/        ~*           !!*:-.    .,:*;:                    \r\n" ; 
			art[31] = "        			 =~          | |    | | | | `--. \\| |\\/| ||  __|   | |    | |  | |            ~*           ~     .,-,     :                     \r\n" ; 
			art[32] = "        			 =~          | \\__/\\\\ \\_/ //\\__/ /| |  | || |___   | |   _| |_ | \\__/\\        ~*           ~              :                \r\n" ; 
			art[33] = "        			 =~           \\____/ \\___/ \\____/ \\_|  |_/\\____/   \\_/   \\___/  \\____/        ~*           ~              :               \r\n" ; 
			art[34] = "       			         =~                                                                           ~*           ;.            ;,               \r\n" ; 
			art[35] = "       			         =~                                                                           ~*             !:,       ,.!                \r\n" ; 
			art[36] = "        			 =~                                                                           ~*               ,.*$=$$,,                          \r\n" ; 
			art[37] = "       			         =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*                                          \r\n" ; 


			for(int i=0;i<art.length;i++) {
				System.out.print(art[i]);

				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}



	@Override
	public void write() {

		System.out.println("\n                                                                    ���ֿ� ������");
		System.out.println("                                                          �����ڽ���ƽ�� ���� ���� ȯ���մϴ�!");
		System.out.println("\n");

		System.out.println("======================================================================================================================================================");

		System.out.println("\n                                                     �� �����ڽ� 100% ��÷ ȸ������ �̺�Ʈ ��\n");
		System.out.println("\n                                                   �����ϰ� �������� �����ڽ���ƽ�� ����� �̺�Ʈ!");
		System.out.println("                                            ȸ�������� �Ͻ� �е鿡�Դ� �پ��� ȭ��ǰ�� ��� �����ڽ��� ����~~");
		System.out.println("                                                      (�ӴڼӴ�) 2022 �Ż� �Ŀ�̼ǵ� ����ϼ���!");

		System.out.println("\n                                                 ���� �ٷ� ȸ�������ϰ� �����غ����� (��^o^)������\r\n");

	}			

	@Override
	public int input() throws Exception {

		int result = 0;

		System.out.println("[ȸ������]\n");
		System.out.print("\n�̸�?");
		pj.setName(sc.next());

		System.out.print("���̵�? [���ҹ���,5-10��]");
		pj.setId(sc.next());

		if(5>pj.getId().length()||pj.getId().length()>10) 
			throw new Exception("���̵��� ���̴� 5~10�� �Դϴ�.");						

		for(int i=0;i<pj.getId().length();i++) {

			char chid = pj.getId().charAt(i);

			if((chid<'a')||(chid>'z'))
				throw new Exception("���̵�� ���ҹ��ڸ� �����մϴ�.");	
		}

		System.out.print("��й�ȣ? [������+����, 6-20��]");
		pj.setPw(sc.next());

		if(6>pj.getPw().length()||pj.getPw().length()>20)
			throw new Exception("��й�ȣ�� ���̴� 6~20�� �Դϴ�.");

		int eng=0, num=0;

		for(int j=0;j<pj.getPw().length();j++) {

			char chpw = pj.getPw().charAt(j);

			if(('a'<=chpw && chpw<='z')||(chpw>='A' && chpw<='Z')) {
				eng++;				
			}else if(0<=num && num<=9) {
				num++;
			}			
		} if(eng==0||num==0)
			throw new Exception("��й�ȣ�� ������ �� ���ڸ� �����մϴ�.");

		String pww;
		do {
			System.out.print("��й�ȣ ��Ȯ��?");
			pww = sc.next();
		}while(!pww.equals(pj.getPw()));

		System.out.print("�޴��� ��ȣ?");
		pj.setTel(sc.next());

		sc.nextLine();

		System.out.print("�ּ�?");
		pj.setAddress(sc.nextLine());

		if(lists == null) {
			lists = new ArrayList<>(); 
		}

		lists.add(pj);

		return result;		
	}


	
	
	
	
	@Override
	public void print() {		
		
		System.out.println("[ȸ�� ���� Ȯ��]\n");
		System.out.println("�̸� : "+pj.getName());
		System.out.println("���̵� : "+pj.getId());
		System.out.println("��й�ȣ : "+pj.getPw());
		System.out.println("����ó : "+pj.getTel());
		System.out.println("�ּ� : "+pj.getAddress());
		
		try {

			if(lists!=null) {

				FileOutputStream fos = new FileOutputStream(ff,true);
				ObjectOutputStream oos = new ObjectOutputStream(fos);

				oos.writeObject(lists);
				fos.close();
				oos.close();
				//System.out.println("������ �����߽��ϴ�!");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}


	}

	@Override
	public void writeFile() {


		Iterator<ProjectMnVO> it = lists.iterator();
		while(it.hasNext()) {

			ProjectMnVO vo = it.next();
			System.out.println(vo.toString());
		}


	}
	public void event() {

		String dab;

		do {
			System.out.println("�������������������������� Special Random Box ��ǰ ���� �ڦ�������������������������");
			System.out.println("��                                                                                ��");
			System.out.println("��                     �Ǻ� Ÿ�Կ� �´� �Ż� �Ŀ�̼� 1��                       ��");
			System.out.println("��                                                                                ��");
			System.out.println("��           �ø��꿵 1�� �޼��� ���̽�����, ���̶��̳�, ����ī��, ����ƽ         ��");
			System.out.println("��                                �� 2�� ���� �߼�                                ��");
			System.out.println("��                                                                                ��");
			System.out.println("������������������������������������������������������������������������������������\n");
			System.out.print("�����ڽ� �̺�Ʈ�� �����Ͻðڽ��ϱ�? [Y/N]");
			dab = sc.next();

		}while(!dab.equals("Y") && !dab.equals("N"));

		if(dab.equals("Y")) {

			System.out.println("\n\n�ش�Ǵ� �Ǻ� Ÿ���� ��ȣ�� �Է����ּ���!\n");
			System.out.println("      �� �Ǻ� Ÿ�� ��� ��");
			System.out.print("1. 21ȣ_���� (CoolMatt �Ŀ�̼� ����)\n2. 21ȣ_�Ǽ� (CoolGlow �Ŀ�̼� ����)\n3. 23ȣ_���� (WarmMatt �Ŀ�̼� ����)\n4. 23ȣ_�Ǽ� (WarmGlow �Ŀ�̼� ����)\n");
			type = sc.nextInt();	

			System.out.printf("�����Ͻ� �Ǻ� Ÿ���� %s�� �Դϴ�.",type);

		}else if(dab.equals("N")) {
			System.out.println("�̺�Ʈ ������ ����Ǿ����ϴ�.");
			System.exit(0);
		}				
	}

	@Override
	public void ranran() {

		Random rd = new Random();

		int co=2; //��÷�� ȭ��ǰ ���� 
		int n=0;

		num = new int[co];

		while(n<co) {
			num[n] = rd.nextInt(4)+1;
			for(int i=0;i<n;i++) {//�ߺ��� �� �����ϱ�
				if(num[i]==num[n]) {
					n--; 
					break;
				}
			}
			n++;
		} 

		System.out.printf("                   ~~~~~~~  �����մϴ�! \\^o^/  ~~~~~~~");
		System.out.printf("\n\n��÷�� �����ڽ� SET�� <%s �Ŀ�̼�> ",fd[type-1]);

		for(int su : num) { 
			System.out.printf("<%s> ",cos[su-1]);
		} System.out.print("�Դϴ�!");

		System.out.printf("\n\n%s���� ������ �ּҴ� �Ʒ��� �����ϴ�.\n", pj.getName() );
		System.out.println("����� �ּ� : "+ pj.getAddress());
	}

	public void check() {

		int suu; 

		while(true) {
			System.out.println("\n======================================================================================================================================================");
			System.out.println("                                                                  <�޴�>");
			System.out.println("                                 \n1.��÷ Ȯ��        2.����� ����        3.����ó ����        4.����");
			System.out.print("=======================================================================================================================================================\n");
			suu = sc.nextInt();

			switch(suu) {
			case 1:
				System.out.println("[��÷ Ȯ��]\n");
				System.out.printf("%s���� ��÷�� ȭ��ǰ�� <%s �Ŀ�̼�> ",pj.getName(),fd[type-1]);
				for(int su : num) { 
					System.out.printf("<%s> ",cos[su-1]);
				}
				System.out.print("�̸�, \n�޾ƺ��� �ּҿ� ����ó�� �Ʒ��� �����ϴ�.\n\n");
				System.out.println("�ּ� : "+ pj.getAddress());
				System.out.println("����ó : "+ pj.getTel());
				break;
			case 2:
				System.out.println("[����� ����]\n");
				System.out.print("������ ����� �ּҸ� �Է����ּ���.");
				pj.setAddress(sc.next());
				System.out.println("\n����Ǿ����ϴ�!");
				System.out.println("\n����� �ּ� : "+ pj.getAddress());
				break;	
			case 3:
				System.out.println("[����ó ����]\n");
				System.out.print("������ ����ó�� �Է����ּ���.");
				pj.setTel(sc.next());
				System.out.println("\n����Ǿ����ϴ�!");
				System.out.println("\n����� ����ó : " + pj.getTel());
				break;
			case 4:
				System.out.println("�̺�Ʈ �������� �����մϴ�.");
				System.exit(0);

			default :
				System.out.println("���� �Է� ����!");

			}
		}		
	}

	@Override
	public void run() {

		while(true) {
			System.out.print("��");

			try {

				Thread.sleep(500);

				if(cnt==10)
					break;

				cnt++;				

			} catch (Exception ie) {
				System.out.println(ie.toString());
			}			
		}

		try {			
			System.out.println("\r\n" + 
					"\r\n" +   
					"                                                                      \r\n" +
					"                                                                      \r\n" +
					"                                                                      \r\n" +
					"                          @#   ,#$              *==$$==!              \r\n" + 
					"                        #@  @@:@@@;-@#.        -$@@.-@@=.             \r\n" + 
					"                       .@@  $@@;~~=@:$@-         !@..@!               \r\n" + 
					"                      .@!  ;@* ~@@-  @@          *@@@@~               \r\n" +  
					"                  ~@@@!=@@=@@@$;  .##~                                \r\n" + 
					"                 =#,     .@@@@*  =@@      -#                          \r\n" + 
					"                  :*@@@@@@@@* !:!@;.    -:=**:                        \r\n" + 
					"                    ..*@@@@@: ~@@-       -$.@.                        \r\n" + 
					"                   ~~@@@@*~ $:@=-        ,$*#        ~@-              \r\n" + 
					"                 ,$@@-$@!   #@=            .       $$#~@$*            \r\n" + 
					"                == ,@#*  .@#! ,;@-                 -@*,;$             \r\n" + 
					"                   @@   *@=     #$=                 ##@@:             \r\n" + 
					"                   ;@!:*@*~~~~~~;~!~~~~~~~~~         ==               \r\n" + 
					"                     !#@@@#######@@##@#######@!                       \r\n" + 
					"                      :$@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       -!@@@@@@@@@@@@@@@@@@@@;-                       \r\n" +  
					"");

			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println(e.toString());
		}		
	}
}
