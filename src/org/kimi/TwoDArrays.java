package org.kimi;

public class TwoDArrays {
	public void rowMajor(int[][] nums) {
		for (int row = 0; row < nums.length; row++) {
			for (int col = 0; col < nums[0].length; col++) {
				System.out.print(nums[row][col] + " ");
			}
			System.out.println();
		}
	}

	public void colMajor(int[][] nums) {
		// row use with nums.length, col use nums[].length
		for (int col = 0; col < nums[0].length; col++) {
			for (int row = 0; row < nums.length; row++) {
				System.out.print(nums[row][col] + " ");
			}
			System.out.println();
		}
	}

	public int sum(int[][] nums) {
		int sum = 0;
		for (int col = 0; col < nums[0].length; col++) {
			for (int row = 0; row < nums.length; row++) {
				sum += nums[row][col];
			}
		}
		return sum;
	}
	
	public int sumForEach(int[][] nums) {
		int sum = 0;
		for (int[] row : nums) {
			for (int element : row) {
				sum += element;
			}
		}
		return sum;
	}
	
	public void addToMajorDiagonal(int[][] nums, int n) {
		for (int col = 0; col < nums[0].length; col++) {
			for (int row = 0; row < nums.length; row++) {
				if (row == col) {
					nums[row][col]+= n;
				}
			}
		}
	}
	
	public void addToMinorDiagonal(int[][] nums, int n) {
		for (int col = 0; col < nums[0].length; col++) {
			for (int row = 0; row < nums.length; row++) {
				if (col == (nums[0].length - row - 1)) {
					//not row == col, if col == size - row - 1
					//nums[0].length = SIZE = amt of rows
					nums[row][col] += n;
				}
			}
		}
	}
	
	public void printArray(int[][] nums) {
		for (int col = 0; col < nums[0].length; col++) {
			for (int row = 0; row < nums.length; row++) {
				System.out.print(nums[row][col] + " ");
			}
			System.out.println();
	}
	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3}, { 4, 5, 6}, {7,8,9 }};
		TwoDArrays td = new TwoDArrays();
		td.rowMajor(mat);
		System.out.println();
		td.colMajor(mat);
		System.out.println();
		
		//using row major method
		System.out.println("" + td.sum(mat)); 
		
		//n x (n+1)/2 = sum of consecutive nums!!! 
		
		System.out.println();
		
		//using enhanced for loop or for each method
		td.addToMajorDiagonal(mat,10);
		
		//add10tomajordiagonal
		td.printArray(mat);
		
		int[][] mat1 = { { 1, 2, 3}, { 4, 5, 6}, {7,8,9 }};
		
		System.out.println();
		td.addToMinorDiagonal(mat1,10);
		td.printArray(mat1);
		
	}
}
