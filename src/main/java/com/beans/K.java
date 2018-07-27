package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class K {
	@Autowired
	L l;

	public void m2() {
		l.m1();
	}
}
