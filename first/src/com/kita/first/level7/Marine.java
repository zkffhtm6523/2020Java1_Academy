package com.kita.first.level7;

public class Marine extends Unit implements AttackUnit {

	private int damage;

	public Marine() {
		super("마린", 50);
		damage = 5;
	}

	@Override
	public void attack(Unit u) {
		if (this == u) {
			System.out.println("ㄴㄴ");
			return;
		}
		System.out.println("따다다다~");
		u.getDamage(damage);
	}

}
