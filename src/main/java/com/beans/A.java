package com.beans;

public class A {
	B b;
	C c;
	public void m1() {
		b.m2();
		c.m3();
	}

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
	
}
