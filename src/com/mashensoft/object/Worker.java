package com.mashensoft.object;

/**
 * �̳�
 * ��װ
 * ��̬
 * @author zongx
 *
 *�κ�һ���࣬���̳���Object.��д������extends Object����ʾ�̳�
 */
public class Worker extends Object{
	static String boss;
	int salary;
	public void work() {
		System.out.println("����5000��");
	}
	public void work(int hour) {
		System.out.println("����5000��");
	}
	public void work(String hour) {
		System.out.println("����5000��");
	}
	public void eat() {
		System.out.println("ϴ��");
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
		System.out.println("�����1���");
//		System.out.println(super.boss);
//		System.out.println(this.boss);
//		System.out.println(boss);
		//super.work();
	}
	public static void main(String[] args) {
		Programmer xingge = new Programmer();
		//xingge.work();
		//Worker w = new Worker();
		//w.eat();//������ô�ԣ��ǹ����Լ������顣
		
		
		/*
		����һ������
		����һ������
		���������
		*/
		Worker xz = new Worker();
		xz.work();
		xz = new Programmer();
		xz.work();
		
		//�����࣬�ӿ�
	}
	
	
	/**
	 * 
	 * 
	 * 1��@Override ����
	 * ����������඼��һ����ͬ���ֵķ���ʱ�����ҷ����Ĳ�������һ������������һ����
	 * 
	 * 2������
	 * ����������඼��һ����ͬ���ֵķ���ʱ�����ҷ����Ĳ���������һ�������ߣ���������һ�������Ͳ�һ��
	 * 
	 * 3����д
	 * ֻ��һ���࣬��������ͬ�����Ͳ�ͬ�����߸�����ͬ
	 */
	
	
}