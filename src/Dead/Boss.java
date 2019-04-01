package Dead;
import java.util.Random;

public class Boss extends Zombie{

	int 방어력;
	String 스킬2;
	int 스킬데미지2;


	public Boss(String name, int HP, int Attack, int Speed, int 크리티컬, String 특징, String 스킬, int 스킬데미지,String 스킬2,int 스킬데미지2) {
		super(name, HP, Attack, Speed, 크리티컬, 특징, 스킬, 스킬데미지);
		this.스킬2 = 스킬2;
		this.스킬데미지2 = 스킬데미지2;

	}

	void 보스정보() {
		System.out.println();
		System.out.println("=============="+name+"의 정보=============");
		System.out.println();
		System.out.println(name+"의 생명력 : "+ HP );
		System.out.println(name+"의 일반공격 : " + Attack);
		System.out.println(name+"의 속도 : "+ Speed);
		System.out.println(name+"의 특징 : "+ 특징);
		System.out.println();
		System.out.println(name+"의 스킬1 :"+ 스킬);
		System.out.println(name+"의 스킬데미지 :"+ 스킬데미지);
		System.out.println(name+"의 스킬2 :"+ 스킬2);
		System.out.println(name+"의 스킬데미지2 :"+ 스킬데미지2);
		System.out.println();
		System.out.println("=====================================");   	
	}

	void 보스공격 (사람 enemy) {

		System.out.println();
		System.out.println(name+"가 생존자를 공격하였습니다!");
		enemy.HP -= Attack;
	}

	void 보스스킬1 (사람 enemy) {
		System.out.println();
		System.out.println(name+" 이(가)"+스킬+"을(를) 사용하였습니다!");
		System.out.println(name+"가 생존자를 공격하였습니다!");
		enemy.HP -= Attack;
	}
	

	void 연타(사람 enemy) {
		enemy.HP -= 10;
		System.out.println("위치의 연타공격");
		System.out.println(enemy.HP);
	}

	/*void 랜덤값() {
		Random random = new Random();
		System.out.println(random.nextInt(10));
		Boss. = random.nextInt(10);
	} */


	void 연타공격(사람 enemy) {  // 위치스킬

		while(enemy.HP > 30) {
			if(Math.random() < 0.8) {
				enemy.HP -= 8;
				System.out.println("데미지 -8");
				System.out.println(enemy.name+"의 HP : "+enemy.HP);
				if(Math.random() < 0.7) {
					enemy.HP -= 10;
					System.out.println("데미지 -10");
					System.out.println(enemy.name+"의 HP : "+enemy.HP);
				}
			} 

			else {
				System.out.println("위치의 공격에서 벗어나셨습니다!");
				break;
			}
		}
	}
}





