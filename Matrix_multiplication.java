package arrays;

import java.util.Scanner;

public class matmul {

	public static void main(String[] args) {
		
		int[][] x = new int[100][100];	// Declare a 2D array for matrix X
		int[][] y = new int[100][100];	// Declare a 2D array for matrix Y
		int[][] z = new int[100][100];	 // Declare a 2D array for the result matrix Z
		int i,j,k,n;	   // Declare variables
		Scanner sc = new Scanner(System.in);	// Create a Scanner object for user input
		
		
		 // Prompt the user to enter the size of the matrices
		System.out.println("Enter Your Matrix Multiplication size");
		n = sc.nextInt();
		System.out.println("Your Matrix Order is " + n +"X" + n);
		
		
		 // Prompt the user to enter the elements of matrix X
		System.out.println("Enter X matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				x[i][j] = sc.nextInt();
			}
		}
		
		 // Prompt the user to enter the elements of matrix Y
		System.out.println("Enter Y matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				y[i][j] = sc.nextInt();
			}
		}
		
		
		 // Display matrix X
		System.out.println("Your X matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
		
		 // Display matrix Y
		System.out.println("Your Y matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(y[i][j]+"\t");
			}
			System.out.println();
		}
		
		 // Perform matrix multiplication and store the result in matrix Z
		System.out.println("Result");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				z[i][j]=0;
				for(k=0;k<n;k++) // Multiply corresponding elements of X and Y and accumulate the result
				{
					z[i][j]+=x[i][k] * y[k][j];
				}
			}
		}
		
		 // Display the result matrix Z
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(z[i][j]+"\t");
			}
			System.out.println();
		}
	}

	}


