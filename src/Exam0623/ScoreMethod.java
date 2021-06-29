package Exam0623;

import java.util.Scanner;

public class ScoreMethod {
	Scanner sc = new Scanner(System.in);
	
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. 성적 입력 2. 성적 검색 3. 성적 출력 0. 프로그램 종료");
		int menu = sc.nextInt();
		return menu;
	}

	public Score scInput() {
		Score s = new Score();
		System.out.println("이름 입력 : ");
		s.setName(sc.next());
		System.out.println("국어 점수 입력 : ");
		s.setKor(sc.nextInt());
		System.out.println("영어 점수 입력 : ");
		s.setEng(sc.nextInt());
		System.out.println("수학 점수 입력 : ");
		s.setMath(sc.nextInt());
		
		return s;
	}

	public boolean scFind(Score[] s) {
		// TODO Auto-generated method stub
		System.out.println("검색할 이름 입력 : ");
		String findName = sc.next();
		
		for(int i=0;i<s.length;i++) {
			if(s[i] == null) {
				continue;
			} else if (s[i].getName().equals(findName)) {
				System.out.println("이름 : "+s[i].getName());
				System.out.println("국어 : "+s[i].getKor());
				System.out.println("영어 : "+s[i].getEng());
				System.out.println("수학 : "+s[i].getMath());
				System.out.println("총점 : "+s[i].getSum());
				System.out.printf("평균 : "+"%.2f",s[i].getAvg());
				System.out.println();
				return false;
			}
		}
		return true;
	}

	public boolean scOutput(Score[] s) {
		// TODO Auto-generated method stub
		System.out.println("출력할 이름 입력 : ");
		String printName = sc.next();
		
		for(int i=0;i<s.length;i++) {
			if(s[i] == null) {
				continue;
			} else if (s[i].getName().equals(printName)) {
			System.out.println("이름 : "+s[i].getName());
			System.out.println("총점 : "+s[i].getSum());
			System.out.printf("평균 : "+"%.2f",s[i].getAvg());
			System.out.println();
			return false;
			}
		}
		return true;
	}

}
