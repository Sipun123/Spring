package com.beans;

public class C {

	D d;
	public void m3()
	{
		System.out.println("hello");
		d.m4();
	}
	public D getD() {
		return d;
	}
	public void setD(D d) {
		this.d = d;
	}
}
