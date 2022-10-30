package org.kimi;

public class FunWithArrays {

	public static final int NUM_STUDENTS = 15;

	public double average(int[] scores) {
		double sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		double avg = sum / scores.length;
		return avg;
	}

	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public void reverse(int[] a) {
		/*int i = 0;
		 int j = a.length - 1;
		 */
		for (int i = 0, j = a.length - 1; i<j; i++,j--) {
			swap(a,i,j);
			i++; j--;
		}
			
	/*	while (i < j) {
			swap(a,i,j);
			i++; j--;
		}
		*/
	}

	public static void main(String[] args) {
		int[] scores = new int[NUM_STUDENTS];
		for (int i = 0; i < NUM_STUDENTS; i++) {
			int score = (int) (101 * Math.random());
			scores[i] = score;
		}
		FunWithArrays fw = new FunWithArrays();
		double average = fw.average(scores);
		for (int i = 0; i < NUM_STUDENTS; i++) {
			System.out.print(scores[i] + " ");
		}
		
		fw.reverse(scores);
		System.out.println();
		System.out.println(average);
		
		for (int i = 0; i < NUM_STUDENTS; i++) {
			System.out.print(scores[i] + " ");
		}

	}
}
