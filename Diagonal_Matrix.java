package arrays;

import java.util.Scanner;

public class diamat {

	public static void main(String[] args) {
		int[][] a = new int[100][100];	// Declare a 2D array to store the diagonal matrix
		int i,j,n,sum=0;	 // Declare variables
		Scanner din = new Scanner(System.in);	// Create a Scanner object for user input
		
		// Prompt the user to enter the order of the diagonal matri
		System.out.println("Enter Your Diagonal Matrix Order");
		n=din.nextInt();
		System.out.println("Your Diagonal Matrix Order is " + n +"X" +n);
		
		 // Prompt the user to enter the elements of the matrix
		System.out.println("Enter Your A Matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=din.nextInt();
			}
		}
		
		 // Display the entered matrix A
		System.out.println("Your Entered A matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		 // Calculate and display the sum of one side of the diagonal
		System.out.println("Sum of one side of Diagonal");
		for(i=0;i<n;i++)
		{
			sum = sum + a[i][i]; 	// Sum the elements on the main diagonal
		}
		System.out.println(sum);
		sum=0;	// Reset the sum
		
		
		// Calculate and display the sum of the other side of the diagonal
		System.out.println("sum of other side of Diagonal");
		for(i=0,j=n-1;i<n;i++,j--)
		{
			sum = sum + a[i][j];	// Sum the elements on the opposite diagonal
		}
		System.out.println(sum);
	}
	}


