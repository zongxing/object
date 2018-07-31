package com.mashensoft.object;

/**
 * 
 * 1:小明
 * 2：星哥
 * 上面这两个具体存在的人，我们把他们叫对象/实例
 * 对上面两个对象进行抽象
 * 对象=》类
 *
 */

/**
 * public 修饰符 class 类名 大括号 定义一个类的内容
 * 
 * 属性：一个类从现实世界抽像出来的多个对象共同拥有的特点 构造方法：创建一个对象/实例的必须的方法 方法：一个类的行为，或者说是为的能力
 * 主方法：包含如下内容： pulibc 修饰符 static 静态 void 无返回值 String[] args 一个输入参数数组 大括号
 * 定义方法体，定义方法的内容
 */
public class Person {
	static String president;
	//类变量，实例变量，类的全局变量
	int age;
	//byte,short,int,long.float,double,boolean,char   数字类型的都是0，boolean默认是false
	public Person() {
	}

	// 实例变量
	String arm;

	public static void beat(int[] a) {
		System.out.println("左手打人");
	}
	//静态方法
	public static void beat() {
		System.out.println("左手打人");
	}
	//实例方法
	public  void sleep() {
		System.out.println("睡觉");
	}

	public static void main(String[] args) {
		Person xiaoming = new Person();// 实例化，创建对象的过程
		Person xingge = new Person();// 实例化，创建对象的过程
		xiaoming.arm = "粗胳膊";
		System.out.println(xiaoming.arm);
		xingge.arm = "细胳膊";
		System.out.println(xingge.arm);
		
		xiaoming.age = 10;
		System.out.println(xiaoming.age);
		int m = 0;
		System.out.println(m);
		//引用静态变量的方法
		//1：直接类名+.+变量名
		//2:如果在一个类里面，直接使用变量名
		Person.president = "小强";
		president = "小刘";
		//xiaoming.president = "习大大";
		//System.out.println("小明的主席："+xiaoming.president);
		//xiaoming.president = "小花";
		System.out.println("星哥的主席："+xingge.president);
		Person.beat();
		beat();
		Person p = new Person();
		p.sleep();
		new Person().sleep();
	}
	{
		int a = 0;
		System.out.println(a);
	}
	static {
		int a = 0;
		System.out.println(a);
	}
	
}
