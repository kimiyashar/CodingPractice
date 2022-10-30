package org.kimi;

public class LightBoard {

	private boolean[][] lights;

	public LightBoard(int numRows, int numCols) {
		lights = new boolean[numRows][numCols];
		// new boolean = false

		for (int row = 0; row < numRows; row++) {
			for (int col = 0; col < numCols; col++) {
				lights[row][col] = onOrOff();
			}
		}
	}

	private boolean onOrOff() {
		int num = (int) (Math.random() * 2);
		// type cast allows u to change type (size of memory used)
		if (num == 0) {
			return false;
		}
		return true;

	}

	public boolean evaluateLight(int row, int col) {
		int ons = 0;
		for (int r = 0; r < lights.length; r++) {
			// lights.length is num of rows
			if (lights[r][col] == true) {
				ons++;
			}
		}

		if (lights[row][col] == true) {
			if (ons % 2 == 0) {
				return false;
			}
		} else if (lights[row][col] == false) {
			if (ons % 3 == 0) {
				return true;
			}
		}
		return lights[row][col];
	}
	
	public void print() {
		for (int row = 0; row < lights.length; row++) {
			for (int col = 0; col < lights[0].length; col++) {
				System.out.print(lights[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main (String[] args) {
		LightBoard lb = new LightBoard(3,3);
		lb.print();
		System.out.println("2,1" + lb.evaluateLight(2,1));
		System.out.println("1,2" + lb.evaluateLight(1,2));
	}
}