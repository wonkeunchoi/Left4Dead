package Dead;
import java.util.Scanner;

import 글.스토리1;

public class Main {

	public static void main(String[] args) {

		사람 일반인 = new 사람("생존자",100,40,30,5,"약함");

		Zombie 남자 = new Zombie("남성좀비",100,25,40,5,"사나움","핡퀴기",30); //이름,HP,Attack,Speed,크리티컬,특징,스킬,스킬데미지.
		Zombie 여자 = new Zombie("여성좀비",80,15,60,3,"민첩하다","은신",0);

		Boss B1 = new Boss("헌터",100,28,50,5,"재빠르다","덮치기",33,"물어뜯기",35);
		Boss B2 = new Boss("부머",42,5,0,0,"느리고_더럽다","분비물_공격",40,"폭발",30);
		Boss B3 = new Boss("위치",120,30,45,10,"불빛과 소리에 반응한다","연속으로_핡퀴기",40,"좀비모으기",0); // 좀비킬러가 되어야 사냥 가능.
		Boss B4 = new Boss("탱커",300,45,50,10,"굉장한_체격과_힘","바위던지기",55,"몸통박치기",50);
		//이름,생명력,공격력,속도,크리티컬,특징,스킬1,스킬데미지,스킬2,스킬데미지2.

		아이템 사슴고기 = new 아이템("사슴고기",0,0);
		아이템 노루의_뿔 = new 아이템("노루의_뿔",0,0);
		아이템 돼지고기 = new 아이템("돼지고기",0,0);
		아이템 뱀독  = new 아이템 ("뱀독",0,0);

		무기 근접무기1 = new 무기("송곳니 나이프",4,0);
		무기 근접무기2 = new 무기("독 송곳니 나이프",5,2);
		무기 둔기1 = new 무기("사슴의 창",8,2);
		무기 둔기2 = new 무기("노루의 창",10,4);
		무기 투척물1 = new 무기("돌맹이",15,0);
		무기 투척물2 = new 무기("독침",20,5);

		Map 맵 = new Map ();
		SafeZone 휴식처 = new SafeZone();

		boolean flag = true; 
		boolean flag2 = true;
		int i;
		//맵.보스등장(B4);
		Scanner scanner = new Scanner(System.in);


		while(일반인.HP >= 0 && B4.HP >= 0) {
			
		while(flag) {
			
			맵.좀비등장(남자);
			flag = false;
		}
		while(남자.HP == 0)break; {
			new Battle(남자,일반인);
			
			}
			if(남자.HP == 0) {
				
				new 스토리1();
			
while(flag2) {
			
			맵.좀비등장(여자);
			flag2 = false;
		}
		if(여자.HP == 0) break; {
		new Battle(여자,일반인);
		}
			}
			if (여자.HP == 0) {
				break;
			}
			
	}		
		System.out.println("사망하셨습니다.. 게임종료");
	}
}
