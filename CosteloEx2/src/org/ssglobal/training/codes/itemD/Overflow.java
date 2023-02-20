package org.ssglobal.training.codes.itemD;

public class Overflow {
	public static boolean sumOverflow(byte x, byte y) {
		int sum = x + y;
		return ((sum < -128) || (sum > 127)) ? true : false;
	}
}
