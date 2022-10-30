package org.kimi;

public class FunWithNumbers {

	public int sumOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			int tens = num % 10;
			sum = sum + tens;
			num = num / 10;
		}
		return sum;
	}
	
	public static void main(String[]args) {
		 FunWithNumbers fwn = new FunWithNumbers();
		 System.out.println(fwn.sumOfDigits(4432));
	}
}


