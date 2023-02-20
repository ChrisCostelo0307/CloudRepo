package org.ssglobal.training.codes.itemF;

public class Fraction {
	public int numerator;
	public int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void printRational() {
		System.out.println(numerator + "/" + denominator);
	}
	
	public Fraction add(Fraction summand) {
		int sumNumerator = (numerator * summand.getDenominator()) + 
						   (denominator * summand.getNumerator());
		int sumDenominator = denominator * summand.getDenominator();
		return new Fraction(sumNumerator, sumDenominator);
	}
	
	public Fraction multiply(Fraction factor) {
		int prodNumerator = numerator * factor.getNumerator();
		int prodDenominator = denominator * factor.getDenominator();
		return new Fraction(prodNumerator,prodDenominator);
	}
	
	public boolean greaterEqual(Fraction comp) {
		double comp1 = (double) numerator / denominator;
		double comp2 = (double) comp.getNumerator() / comp.getDenominator();
		return comp1 >= comp2 ? true : false;
	}
}
