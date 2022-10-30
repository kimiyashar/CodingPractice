package org.kimi;

public class ArrayTester {

	public static int[] getColumn(int[][] arr2D, int c) {
		int[] col = new int[arr2D.length];
		for (int row = 0; row < arr2D.length; row++) {
			col[row] = arr2D[row][c];
		}
		return col;
	}

	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		boolean found = false;
		for (int r1 = 0; r1 < arr1.length; r1++) {
			for (int r2 = 0; r2 < arr2.length; r2++) {
				if (arr1[r1] == arr2[r2]) {
					found = true;
				}
			}
			if (!found) {
				return false;
			} else {
				found = false;
			}
		}
		return true;
	}

	public static boolean containsDuplicates(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if ((i != j) && (arr[i] == arr[j])) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean isLatin(int[][] square) {
		boolean firstrowdupes = ArrayTester.containsDuplicates(square[0]);
		if (!firstrowdupes){
			for (int row = 1; row < square.length; row++) {
				boolean valsinrows = ArrayTester.hasAllValues(square[0], square[row]);
				if (!valsinrows) {
					return false;
				}
			}
			for (int col = 0; col < square[0].length; col++) {
				boolean valinsincols = ArrayTester.hasAllValues(square[0], 
						ArrayTester.getColumn(square, col));
				if (!valinsincols) {
					return false;
				}
			}
			
		}
		else {return false;}
	return true;
	}

	public static void main(String[] args) {
		int[][] nums = { { 1, 2, 3, 4 }, { 2, 1, 4, 3 }, { 2, 2, 2, 1 } };
		int[] col = ArrayTester.getColumn(nums, 3);
		for (int i = 0; i < col.length; i++) {
			System.out.print(col[i] + " ");
		}
		System.out.println(ArrayTester.hasAllValues(nums[0], nums[1]));
		System.out.println(ArrayTester.containsDuplicates(nums[2]));
		int[][] nums2 = {{1,2,3},
						{2,3,1},
						{3,1,2}};
		System.out.println(ArrayTester.isLatin(nums2));
		int[][] nums3 = {{1,2,1},{2,1,1},{1,1,2}};
		System.out.println(ArrayTester.isLatin(nums3));
		}
		
	}

