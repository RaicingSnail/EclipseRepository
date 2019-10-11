package com.test2;

import java.io.Serializable;

public interface Flyable {

	int i = 1;
	void a();
}
class Bird implements Flyable, Serializable {

	@Override
	public void a() {
		
	}
}