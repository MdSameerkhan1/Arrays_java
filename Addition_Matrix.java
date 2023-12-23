package arrays;

import java.util.Scanner;

public class addmatrix {

	public static void main(String[] args) {
		// Declare two 2D arrays to store matrices A and B
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int n,i,j; 		// Declare variables for matrix size 
		Scanner din = new Scanner(System.in);	// Create a Scanner object for user input
		System.out.println("Enter Your Addition Matrix Size");
		n=din.nextInt();
		System.out.println("Your Matrix size is " + n + "X" + n);
		
		
		 // Prompt the user to enter matrix A 
		
		System.out.println("Enter A Matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j] = din.nextInt();
			}
		}
		
		
		// Prompt the user to enter matrix B
		
		System.out.println("Enter B Matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				b[i][j] = din.nextInt();
			}
		}
		
		
		
		// Display matrix A
		
		System.out.println("Your A Matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		// Display matrix B
		
		System.out.println("Your B Matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		 // Perform matrix addition and display the result
		
		System.out.println("Result");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				
				System.out.print(a[i][j]+b[i][j]+"\t");	// Add corresponding elements of matrices A and B and print the result
			}
			System.out.println();
		}
	}



	}


