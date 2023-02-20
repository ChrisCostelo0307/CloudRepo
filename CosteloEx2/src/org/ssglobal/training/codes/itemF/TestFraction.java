package org.ssglobal.training.codes.itemF;

public class TestFraction {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(10,6);
		Fraction f2 = new Fraction(3,17);
		f1.printRational();
		f2.printRational();
		f2.multiply(f1).printRational();
		f2.add(f1).printRational();
		System.out.println(f2.greaterEqual(f1));
	}
}
