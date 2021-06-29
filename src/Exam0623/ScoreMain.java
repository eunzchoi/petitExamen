package Exam0623;

public class ScoreMain {
	public static void main(String[] args) {
		ScoreMethod sm = new ScoreMethod();
		Score s[] = new Score[5];
		int cnt = 0;
		
		while(true) {
			int menu = sm.menu();
			
			switch(menu) {
			case 1:
				if(cnt == 5) {
					System.out.println("더 이상 저장할 수 없습니다.");
				} else {
					s[cnt] = sm.scInput();
					cnt++;
				}
				break;
			case 2:
				if(cnt == 0) {
					System.out.println("검색할 성적이 없습니다.");
				} else {
					if(sm.scFind(s)) {
						System.out.println("찾는 이름이 없습니다.");
					}
				}
				break;
			case 3:
				if(cnt == 0) {
					System.out.println("입력된 성적이 없습니다.");
				} else {
					if(sm.scOutput(s)) {
						System.out.println("찾는 이름이 없습니다.");
					}
				}
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 번호는 없는 메뉴입니다.");
			}
		}
	}
}
