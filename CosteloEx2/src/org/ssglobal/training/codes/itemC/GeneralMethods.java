package org.ssglobal.training.codes.itemC;

public class GeneralMethods {
	public void powersOfTwo() {
		for (byte ctr = 1; ctr <= 10; ctr++) {
			System.out.print((int) Math.pow(2, ctr) + " ");
		}
	}
	
	public void alarm(int counter) {
		for(int ctr = 1; ctr <= counter; ctr++) {
			System.out.println("Alarm!");
		}
	}
	
	public short sum100() {
		short sum = 0;
		for(short ctr = 1; ctr <= 100; ctr++) {
			sum += ctr;
		}
		return sum;
	}
	
	public static int sumRange(int firstNum, int secondNum) {
		int sum = 0;
		for(int ctr = firstNum; ctr <= secondNum; ctr++) {
			sum += ctr;
		}
		return sum;
	}
	
	public static int maxOfTwo(int firstNum, int secondNum) {
		return (firstNum > secondNum) ? firstNum : secondNum;
	}
	
	public boolean larger(double num1, double num2) {
		return (num1 > num2) ? true : false;
	}
	
	public boolean evenlyDivisible(int num1, int num2) {
		return (num1 % num2 == 0 || num2 % num1 == 0) ?
				true: false;
	}
}
