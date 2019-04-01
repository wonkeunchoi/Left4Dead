package Dead;
import java.util.Random;

public class 유닛 {
	public static int SPEED_MAX = 100;
	int HP;
	int Attack;
	int Speed;
	int 크리티컬;
	String name;
	String 특징;


	public void information() {

		System.out.println();
		System.out.println("=============="+name+"의 정보=============");
		System.out.println();
		System.out.println(name+"의 생명력 : "+ HP );
		System.out.println(name+"의 일반공격 : " + Attack);
		System.out.println(name+"의 속도 : "+ Speed);
		System.out.println(name+"의 특징 : "+ 특징);
		System.out.println();
		System.out.println("=====================================");   	
	}

	public void 상태() {
		System.out.println();
		System.out.println(name+"의 HP는 : "+HP+"입니다.");
		System.out.println();
	}

	public boolean be_damaged (int 일반인_Attack){
		boolean val = new Random().nextInt(SPEED_MAX/(SPEED_MAX-this.Speed))==0;// 100 -  20 = 얻어맞을 확률 : 80 
		if(val) { // 얻어맞았다!
			this.HP = this.HP - 일반인_Attack; // HP가 깎였다.
			return true; // 얻어맞은 사실을 알린다.
		}else return false; // 회피했다!
	}

}
