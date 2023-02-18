/**
 * 
 */
package com.prodemy.gen14;

import java.util.Arrays;

/**
 * @author Wahyu Wijayanto
 *
 */
public class SampleArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrayganjil = new int[5];

		arrayganjil[0] = 1;
		arrayganjil[1] = 3;
		arrayganjil[2] = 5;
		arrayganjil[3] = 7;
		arrayganjil[4] = 9;
		
		System.out.println(Arrays.toString(arrayganjil));
		
		for (int i = 0; i < arrayganjil.length; i++) {
			System.out.print(arrayganjil[i] + " ");
		}
		
		System.out.println();
		
		String[] arrayString = new String[5];
		arrayString[0] = "text1";
		arrayString[1] = "text2";
		arrayString[2] = "text3";
		arrayString[3] = "text4";
		arrayString[4] = "text5";
		
		
		for (int i = 0; i < arrayString.length; i++) {
			System.out.print(arrayString[i] + " ");
		}
	
	}
}