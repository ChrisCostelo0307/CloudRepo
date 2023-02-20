package org.ssglobal.training.codes.itemC;

public class TestMethods {
	public static void main(String[] args) {
		GeneralMethods gm = new GeneralMethods();
		// calls the powersOfTwo method
		gm.powersOfTwo();
		System.out.println();
		// calls the alarm method
		gm.alarm(5);
		// display the output of the other methods declared in GeneralMethod class
		System.out.println(gm.sum100());
		System.out.println(gm.sumRange(10,20));
		System.out.println(gm.maxOfTwo(10,20));
		System.out.println(gm.larger(10.2,22.1));
		System.out.println(gm.evenlyDivisible(9,3));
	}
}
