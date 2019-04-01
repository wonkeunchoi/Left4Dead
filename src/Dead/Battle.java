package Dead;
import java.util.Scanner;
import 글.스토리1;

public class Battle {
	
public Battle(Zombie enemy, 사람	self) {	

Scanner scanner = new Scanner(System.in);
	System.out.println("||  1.싸운다 | 2.남성좀비의 정보를 확인한다 | 3.SafeZone 이동 | 4. 인벤토리  |  || ");
	
	int 배틀 = scanner.nextInt();
	
	if(배틀 == 1) {
		System.out.println("싸운다를 선택하셨습니다.");	
		System.out.println();
		
		enemy.일반공격(self,enemy);				
		self.상태();
		self.공격(enemy);
		enemy.상태();
		if(enemy.HP == 0) {
			
			System.out.println("⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎");
			System.out.println();
			System.out.println("전투에서 승리하셨습니다!!");
			System.out.println();
			System.out.println("⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎⚔︎");
		
		}
		}
	}	
}


