package com.kita.first.level7;

//인터페이스 네이밍 : 주로 형용사 타입
//인터페이스가 인터페이스 상속받을 시 extends, 인터페이스가 클래스를 상속받지 못함
//인터페이스, 추상클래스 둘 다 부모 역할, 
public interface AttackUnit {
	void attack(Unit u);
}
