package com.basic;

public class MultiplyMatrix {
	public static void main(String[] args) {
		int r1 = 2, c1 = 3;
		int r2 = 3, c2 = 2;
		int[][] firstMatrix = { { 3, -2, 5 }, { 3, 0, 4 } };
		int[][] secondMatrix = { { 2, 3 }, { -9, 0 }, { 0, 4 } };

		
		//Multiplying two matrix
		int[][] product = multiplyMatrices(firstMatrix, secondMatrix, r1,c1,c2);
		
		
		//Displying Two matrices
		displayProduct(product);
	}

	public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int r1, int c1, int c2) {
		int[][] product = new int[r1][c2];
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				for (int k = 0; k < c1; k++) {
					product[i][j] += firstMatrix[i][k] * secondMatrix[i][k];
				}
			}
		}
		return product;
	}

	public static void displayProduct(int[][] product) {

		System.out.println("Product of two matrices is: ");
		for (int[] row : product) {
			for (int column : row) {
				System.out.println(column + "  ");
			}
			System.out.println();
		}
	}

}
