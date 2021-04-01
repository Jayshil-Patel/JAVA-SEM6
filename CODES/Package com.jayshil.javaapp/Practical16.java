package com.jayshil.javaapp;

public class Practical16 {
	public static void main(String[] args) {
		double m[][]={
				{50.5},
				{500.1,70.70},
				{100.9,0.5,20.20}
		};
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println("");
		}
		int row_num = m.length;
		int column_num_0= m[0].length;
		int column_num_1 = m[1].length;
		int column_num_2 = m[2].length;
		System.out.println("In jagged array number of rows :"+row_num);
		System.out.print("In jagged array number of columns :"+column_num_0);
		System.out.print(", "+column_num_1+", "+column_num_2);

	}
}
