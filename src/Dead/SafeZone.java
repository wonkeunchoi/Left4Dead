package Dead;

import java.util.Scanner;

import 글.아이템_글;
import 글.아이템_글2;
import 글.아이템_글3;

public class SafeZone {

	Scanner scanner = new Scanner(System.in);

	void 무기설계도() {

		System.out.println();
		System.out.println("++무기설계도를 선택하셨습니다.++");
		System.out.println("제조를 원하는 무기종류를 선택해주세요.");
		System.out.println();
		System.out.println("        🛠 ⚙️ 🛠           ");
		System.out.println();
		System.out.println("1.근접무기  2.둔기  3.투척물");
		int 무기선택 = scanner.nextInt();
		if(무기선택 == 1) {
			new 아이템_글();
			int 근접무기 = scanner.nextInt();
			if (근접무기 == 1) {
				System.out.println("'송곳니 나이프'를 선택하셨습니다.");
			}
			if (근접무기 == 2) {
				System.out.println("'독 송곳니 나이프'를 선택하셨습니다.");
			}
		}
		if(무기선택 == 2) {
			new 아이템_글2();
			int 둔기 = scanner.nextInt();
			if (둔기 == 1) {
				System.out.println("'사슴의 창'을 선택하셨습니다.");
			}
			if (둔기 == 2) {
				System.out.println("'노루의 창'을 선택하셨습니다.");
			}
		}
		if(무기선택 == 3) {
			new 아이템_글3();
			int 투척물 = scanner.nextInt();
			if (투척물 == 1) {
				System.out.println("'돌맹이'를 선택하셨습니다.");
			}
			if (투척물 == 2) {
				System.out.println("'독침'을 선택하셨습니다.");
			}
		}
	}
}
