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
					System.out.println("�� �̻� ������ �� �����ϴ�.");
				} else {
					s[cnt] = sm.scInput();
					cnt++;
				}
				break;
			case 2:
				if(cnt == 0) {
					System.out.println("�˻��� ������ �����ϴ�.");
				} else {
					if(sm.scFind(s)) {
						System.out.println("ã�� �̸��� �����ϴ�.");
					}
				}
				break;
			case 3:
				if(cnt == 0) {
					System.out.println("�Էµ� ������ �����ϴ�.");
				} else {
					if(sm.scOutput(s)) {
						System.out.println("ã�� �̸��� �����ϴ�.");
					}
				}
				break;
			case 0:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("���õ� ��ȣ�� ���� �޴��Դϴ�.");
			}
		}
	}
}
