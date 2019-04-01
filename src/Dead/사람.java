package Dead;

public class 사람 extends 유닛 {
					
	String 무기;
	int 컨디션;
	int 경험치;
	public 인벤토리 inven;
	
	public 사람(String name,int HP,int Attack,int Speed,int 크리티컬,String 특징) {
		super();
		this.name = name;
		this.HP = HP;
		this.Attack = Attack;
		this.Speed = Speed;
		this.크리티컬 = 크리티컬;
		this.특징 = 특징;
		this.컨디션 = 컨디션;
		this.경험치 = 경험치;
	}

	
	void 공격(Zombie enemy) {
		System.out.println();
		System.out.println(name+"(이)가 적을 공격하였습니다!");
		enemy.HP -= Attack;
		if(enemy.HP < 0) {
			enemy.HP = 0;
		}
	}
	
	void 보스공격(Boss 적) {
		System.out.println();
		System.out.println(name+"(이)가 적을 공격하였습니다!");
		적.HP -= Attack;
		if(적.HP < 0) {
			적.HP = 0;
		}
	}
}
