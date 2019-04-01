package Dead;

public class Zombie extends 유닛{

	String 스킬;
	int 스킬데미지;
	
	
	public Zombie(String name,int HP,int Attack,int Speed,int 크리티컬,String 특징,String 스킬,int 스킬데미지){
		super();
		this.name = name;
		this.HP = HP;
		this.Attack = Attack;
		this.Speed = Speed;
		this.크리티컬 = 크리티컬;
		this.특징 = 특징;
		this.스킬 = 스킬;
		this.스킬데미지 = 스킬데미지;
	}
	
	void 일반공격(사람 self, Zombie enemy){
		System.out.println();
		System.out.println(enemy.name+"가 생존자를 공격하였습니다!");
		self.HP -= Attack;
			if(self.HP < 0 || self.HP == 0) {
				self.HP = 0;
				System.out.println(self.name+"가 사망하였습니다.");
				System.out.println("The End....");
			}
			
	}
}
