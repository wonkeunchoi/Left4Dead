package Dead;


public class Map {
	
	
	int 컨티션상승;
	int 컨디션감소;
	
	//오류 
	void 좀비등장(Zombie zombie) {
		System.out.println("☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎");
		System.out.println();
		System.out.println(zombie.name+"가 등장하였습니다!!");
		System.out.println();
		System.out.println("☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎☣︎");
		
	}
	 void 보스등장(Boss boss) {
		    System.out.println("☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎!!!위험!!!☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎");
		    System.out.println();
			System.out.println("	💀보스"+boss.name+"가 출현하였습니다!💀");
			System.out.println();
			boss.보스정보();
			System.out.println();
			System.out.println("☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎☠︎");
			
	 }
}
