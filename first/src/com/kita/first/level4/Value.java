package com.kita.first.level4;

public class Value {
	private int val;
	//생성자 생성
	public Value(int val) {
		this.val = val;
	}
	
	public int getVal() {
		return val;
	}
	
	
	
//	@Override
//	public boolean equals(Object obj) {
//		Value temp = (Value)obj;
//		return val == temp.val;
//	}
	
	public boolean equals(Value v) {
		return this.val == v.val;
	}
	@Override
	public String toString() {
//		return String.valueOf(getVal());
		return String.format("%,d", getVal());
	}
}
