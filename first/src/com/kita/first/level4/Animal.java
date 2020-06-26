package com.kita.first.level4;

public class Animal extends Object {
	
	/*
	 * object heap 메모리 영역에 들어가고
	 * obj->animal->bird
	 * 
	 * 객체를 3개 만들면, obj도 3개가 만들어짐..
	 * 
	 * 부모가 같은 메소드가 있으면 조부모꺼 불가능.
	 */
	
	private String name;
	private String type;
	//포유류, 조류, 어류
	
//	public Animal() {}
	//1번. 기본 생성자를 만들어서 오류를 해결, 그리고 기본생성자의 접근제한자 private
	//2번. bird의 super("", "")를 추가해준다
	//상속관계만 접근 가능 + 패키지 안 접근 가능
	protected Animal(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	void crying() {
		System.out.println("울다~~");
	}
	
	void eat() {
		System.out.println("먹다~~");
	}
	
	void whoAmI() {
		System.out.printf("나는 %s / %s\n",name,type);
	}
}
