package kr.ac.kookmin.oop.ch5;

abstract class Calculator {
	public abstract int add(int a, int b);
	public abstract int substract(int a, int b);
	public abstract double average(int[] a);
}

public class GoodCalc extends Calculator{
	
	public int add(int a, int b) {
		return a+b;
	}
	public int substract(int a, int b) {
		return a-b;
	}
	public double average(int[] a) {
		double avg = 0;
		for(int i = 0; i < a.length; i++) {
			avg += a[i];
		}
		return avg/a.length;
	}

	public static void main(String[] args) {
		Calculator myCalc = new GoodCalc();
	}

}
