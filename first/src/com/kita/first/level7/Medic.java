package com.kita.first.level7;

public class Medic extends Unit {

	public Medic() {
		super("메딕", 70);
	}
	//Carable로 형변환이 가능하냐 가능하지 못하냐.
	public void heal(Unit unit) {
		if (unit == this) {
			System.out.println("자신을 치료할 수 없습니다.");
			return;
		} else if(unit instanceof Carable == true) {
			int healing = (unit.MAX_HP)-(unit.current_hp);
			unit.setCurrent_hp(healing);
			System.out.printf("힐량 : %d, %s의 현재 HP : %s\n",healing,unit.NAME,unit.getCurrent_hp());
		} else if(unit instanceof Carable == false) {
			System.out.println("치료가능한 대상이 아닙니다.");
		}

	}
}