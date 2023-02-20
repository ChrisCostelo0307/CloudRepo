package org.ssglobal.training.codes.itemD;

public class TestOverflow {
	public static void main(String[] args) {
		Overflow of = new Overflow();
		byte x = -20;
		byte y = -118;
		System.out.print(of.sumOverflow(x, y));
	}
}
