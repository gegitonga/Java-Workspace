import java.util.*;
public class TwoDimArrays{
	public static void main(String[] args){
		int[][] matrix = new int[10][10];
		for(int row = 0; row < matrix.length; row++){
			for(int column = 0; column < matrix[row].length; column++){
				matrix[row][column] = (int)(Math.random() * 100);
			}
		}	
		//printArray
		printArray(matrix);
		System.out.println();
		sumArray(matrix);
	}
	
	//Printing arrays
	public static void printArray(int[][] matrix){
		for(int row = 0; row < matrix.length; row++){
			for(int column = 0; column < matrix[row].length; column++){
				System.out.print(matrix[row][column]+" ");
			}
			System.out.println();
		}
	}
	
	//Summing all elements
	public static void sumArray(int[][] matrix){
		int total = 0;
		for(int row = 0; row < matrix.length; row++){
			for(int column = 0; column < matrix[row].length; column++){
				total += matrix[row][column];
			}
		}
		System.out.print("Total : "+ total);
	}
	
}