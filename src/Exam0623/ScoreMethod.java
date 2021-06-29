package Exam0623;

import java.util.Scanner;

public class ScoreMethod {
	Scanner sc = new Scanner(System.in);
	
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. ���� �Է� 2. ���� �˻� 3. ���� ��� 0. ���α׷� ����");
		int menu = sc.nextInt();
		return menu;
	}

	public Score scInput() {
		Score s = new Score();
		System.out.println("�̸� �Է� : ");
		s.setName(sc.next());
		System.out.println("���� ���� �Է� : ");
		s.setKor(sc.nextInt());
		System.out.println("���� ���� �Է� : ");
		s.setEng(sc.nextInt());
		System.out.println("���� ���� �Է� : ");
		s.setMath(sc.nextInt());
		
		return s;
	}

	public boolean scFind(Score[] s) {
		// TODO Auto-generated method stub
		System.out.println("�˻��� �̸� �Է� : ");
		String findName = sc.next();
		
		for(int i=0;i<s.length;i++) {
			if(s[i] == null) {
				continue;
			} else if (s[i].getName().equals(findName)) {
				System.out.println("�̸� : "+s[i].getName());
				System.out.println("���� : "+s[i].getKor());
				System.out.println("���� : "+s[i].getEng());
				System.out.println("���� : "+s[i].getMath());
				System.out.println("���� : "+s[i].getSum());
				System.out.printf("��� : "+"%.2f",s[i].getAvg());
				System.out.println();
				return false;
			}
		}
		return true;
	}

	public boolean scOutput(Score[] s) {
		// TODO Auto-generated method stub
		System.out.println("����� �̸� �Է� : ");
		String printName = sc.next();
		
		for(int i=0;i<s.length;i++) {
			if(s[i] == null) {
				continue;
			} else if (s[i].getName().equals(printName)) {
			System.out.println("�̸� : "+s[i].getName());
			System.out.println("���� : "+s[i].getSum());
			System.out.printf("��� : "+"%.2f",s[i].getAvg());
			System.out.println();
			return false;
			}
		}
		return true;
	}

}
