package org.ssglobal.training.codes.itemA;

public class BadNews {
	public static int maxOdd = 21;
	
	public static void writeOdds() {
		/* 
		* print each odd number
		*/
		for (int count = 1; count < (maxOdd - 1); count+=2) {
			System.out.print(count + " ");
		}
		//print the last odd number
		System.out.println(maxOdd);
	}
	
	public static void main(String[] args) {
		// write all odds up to 21
		writeOdds();
		
		// now, write all odds up to 11;
		BadNews.maxOdd = 11;
		writeOdds();
	}
}

/*
 * Errors 
 * 
 * - The MAX_ODD variable must not be in final.
 * - The MAX_ODD must be maxOdd, because the variable will change
 *   value, so it should not be declared as constant.
 * - The count variable must be declared outside the for loop.
 * - The count = count + 2, must be converted to count = count + 1;
 * - The print count + 2, must not add 2 because it makes the
 *   value of count to 23.
 * - The global variable MAX_ODD must access the class first
 *   before assigning a new value.
 * 
 */
