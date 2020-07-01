package com.kita.first.level7;

public class Unit {
	public final String NAME;
	public final int MAX_HP;
	public int current_hp;
	
	//final은 생성자로 값 넣어주기
	public Unit(String name, int max_hp) {
		this.NAME = name;
		this.MAX_HP = max_hp;
		this.current_hp = max_hp;
	}
	
	public int getCurrent_hp() {
		if (current_hp == 0) {
			System.out.println("죽었습니다. ");
		}
		return current_hp;
	}
	
	public void setCurrent_hp(int hp) {
		this.current_hp += hp;
	}
	
	public void getDamage(int damage) {
		current_hp -= damage;
	}

	public void move(int x, int y) {
		System.out.printf("x : %d, y : %d 좌표로 이동\n",x , y);
	}
	@Override
	public String toString() {
		//%n이 개행 시 더 안전함
		return String.format("%s, 현재 HP : %d%n", NAME, getCurrent_hp());
	}	 
}
