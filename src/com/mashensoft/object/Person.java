package com.mashensoft.object;

/**
 * 
 * 1:С��
 * 2���Ǹ�
 * ����������������ڵ��ˣ����ǰ����ǽж���/ʵ��
 * ����������������г���
 * ����=����
 *
 */

/**
 * public ���η� class ���� ������ ����һ���������
 * 
 * ���ԣ�һ�������ʵ�����������Ķ������ͬӵ�е��ص� ���췽��������һ������/ʵ���ı���ķ��� ������һ�������Ϊ������˵��Ϊ������
 * �������������������ݣ� pulibc ���η� static ��̬ void �޷���ֵ String[] args һ������������� ������
 * ���巽���壬���巽��������
 */
public class Person {
	static String president;
	//�������ʵ�����������ȫ�ֱ���
	int age;
	//byte,short,int,long.float,double,boolean,char   �������͵Ķ���0��booleanĬ����false
	public Person() {
	}

	// ʵ������
	String arm;

	public static void beat(int[] a) {
		System.out.println("���ִ���");
	}
	//��̬����
	public static void beat() {
		System.out.println("���ִ���");
	}
	//ʵ������
	public  void sleep() {
		System.out.println("˯��");
	}

	public static void main(String[] args) {
		Person xiaoming = new Person();// ʵ��������������Ĺ���
		Person xingge = new Person();// ʵ��������������Ĺ���
		xiaoming.arm = "�ָ첲";
		System.out.println(xiaoming.arm);
		xingge.arm = "ϸ�첲";
		System.out.println(xingge.arm);
		
		xiaoming.age = 10;
		System.out.println(xiaoming.age);
		int m = 0;
		System.out.println(m);
		//���þ�̬�����ķ���
		//1��ֱ������+.+������
		//2:�����һ�������棬ֱ��ʹ�ñ�����
		Person.president = "Сǿ";
		president = "С��";
		//xiaoming.president = "ϰ���";
		//System.out.println("С������ϯ��"+xiaoming.president);
		//xiaoming.president = "С��";
		System.out.println("�Ǹ����ϯ��"+xingge.president);
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
