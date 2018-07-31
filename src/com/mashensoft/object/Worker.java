package com.mashensoft.object;

/**
 * 继承
 * 封装
 * 多态
 * @author zongx
 *
 *任何一个类，都继承自Object.手写出来，extends Object，显示继承
 */
public class Worker extends Object{
	//加了一行注释
	//再加一行代码
	static String boss;
	int salary;
	public void work() {
		System.out.println("打工挣5000块");
	}
	public void work(int hour) {
		System.out.println("打工挣5000块");
	}
	public void work(String hour) {
		System.out.println("打工挣5000块");
	}
	public void eat() {
		System.out.println("洗手");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
	}
}


class Programmer extends Worker{
	String boss;
	@Override
	public void work() {
		System.out.println("编程挣1万块");
//		System.out.println(super.boss);
//		System.out.println(this.boss);
//		System.out.println(boss);
		//super.work();
	}
	public static void main(String[] args) {
		Programmer xingge = new Programmer();
		//xingge.work();
		//Worker w = new Worker();
		//w.eat();//具体怎么吃，是工人自己的事情。
		
		
		/*
		定义一个变量
		构造一个对象
		父类和子类
		*/
		Worker xz = new Worker();
		xz.work();
		xz = new Programmer();
		xz.work();
		
		//抽像类，接口
	}
	
	
	/**
	 * 
	 * 
	 * 1：@Override 覆盖
	 * 当父类和子类都有一个相同名字的方法时，并且方法的参数个数一样，参数类型一样。
	 * 
	 * 2：重载
	 * 当父类和子类都有一个相同名字的方法时，并且方法的参数个数不一样，或者（参数个数一样）类型不一样
	 * 
	 * 3：重写
	 * 只有一个类，方法名相同，类型不同，或者个数不同
	 */
	
	
}