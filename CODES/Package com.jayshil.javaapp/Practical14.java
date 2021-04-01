package com.jayshil.javaapp;

public class Practical14 {
	public static void main(String[] args) {
		// one dimensional array
		System.out.print("One dimensional array");
		int month_days[] = {1,2,3,4,5};
		System.out.println("");
		for(int a=0;a<5;a++)
		{
			System.out.println(month_days[a]);
		}

		// two dimensional array
		System.out.println("");
		System.out.println("Two dimensional array");
		int twoD[][]=new int[4][5];
		int i,j,k=0;

		for (i=0;i<4;i++)
			for (j=0;j<5;j++){
				twoD[i][j]=k;
				k++;
			}
		for (i=0;i<4;i++){
			for (j=0;j<5;j++)
				System.out.print(twoD[i][j]+" ");
			System.out.println();
		}

		// Multidimensional array
		System.out.println("");
		System.out.println("Multidimensional array");
		int mulD[][]=new int[4][];
		mulD[0]=new int[1];
		mulD[1]=new int[2];
		mulD[2]=new int[3];
		mulD[3]=new int[4];

		int l,m,n =0;

		for (l=0;l<4;l++)
			for (m=0;m<l+1;m++)
			{
				mulD[l][m]=n;
				n++;
			}
		for(l=0;l<4;l++){
			for (m=0;m<l+1;m++)
				System.out.print(mulD[l][m]+" ");
			System.out.println();
		}
	}
}
