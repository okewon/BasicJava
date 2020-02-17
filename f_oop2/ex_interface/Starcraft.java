package f_oop2.ex_interface;

public class Starcraft {
	
	public static void main(String[] args) {
		Marine marine = new Marine();
		Tank tank = new Tank();
		DropShip dropship = new DropShip();
		SCV scv = new SCV();
		
//		scv.repair(marine);
		scv.repair(tank);
		scv.repair(dropship);
		scv.repair(scv);
	}
}

class Unit{
	int hp;
	final int MAX_HP;
	
	Unit(int hp) {
		MAX_HP = hp;
		this.hp = MAX_HP;
	}
}

class Marine extends Unit{
	public Marine() {
		super(40);
	}
}

class Tank extends Unit implements Repairable{
	Tank(){
		super(150);
	}
}

class DropShip extends Unit implements Repairable{
	public DropShip() {
		super(125);
	}
}

class SCV extends Unit implements Repairable{
	SCV(){
		super(60);
	}
	
	void repair(Repairable r){
		if(r instanceof Unit){//Unit으로 형변환이 가능한지 확인
			Unit u = (Unit) r;
			
			while(u.hp < u.MAX_HP){
				u.hp++;
			}
		}
	}
}

interface Repairable{
	
}

