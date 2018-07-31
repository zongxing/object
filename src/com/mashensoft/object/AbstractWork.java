package com.mashensoft.object;

public abstract class AbstractWork {
	public abstract void work();

}

class SubWork2 extends AbstractWork {
	@Override
	public void work() {
		System.out.println("SubWork2");
	}
}

class SubWork1 extends AbstractWork {

	@Override
	public void work() {
		System.out.println("SubWork1");
	}

	public static void main(String[] args) {
		AbstractWork aw = new SubWork1();
		aw.work();
		aw = new SubWork2();
		aw.work();
	}
}