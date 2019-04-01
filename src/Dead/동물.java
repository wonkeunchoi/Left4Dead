package Dead;

import java.util.Random;

public class 동물 {
	public static int SPEED_MAX = 100;
	String name;
	int Speed;
	int HP;
	int Attack;
	String 아이템;
	
	동물(String name,int HP,int Attack,String 아이템){
		this.name = name;
		this.HP = HP;
		this.Attack = Attack;
		this.아이템 = 아이템;
	}
	
	public void 정보() {
		
		System.out.println(">>>>>>>>>> " +name+ "의 정보입니다 <<<<<<<<");
		System.out.println();
		System.out.println("이름 : " +name);
		System.out.println("HP  : " +HP);
		System.out.println("공격력 : " +Attack);
		System.out.println("회피율 : " +Speed);
		System.out.println("아이템드랍 : " +아이템);
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>><<<<<<<<<<<<<<<");
		System.out.println();
	}
	
	public boolean be_damaged (int 사람_Attack){
		boolean val = new Random().nextInt(SPEED_MAX/(SPEED_MAX-this.Speed))==0;// 100 -  20 = 얻어맞을 확률 : 80 
		if(val) { // 얻어맞았다!
			this.HP = this.HP - 사람_Attack; // HP가 깎였다.
			return true; // 얻어맞은 사실을 알린다.
		}else return false; // 회피했다!
	}
	
	String 공격(){
		
		return "아이템드랍";
	
	}
}
