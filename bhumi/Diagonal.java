import java.util.*;
import java.util.Scanner;

class Diagonal{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int m,n,i,j,k;
	System.out.println("Enter the values of m and n: ");
	m=sc.nextInt();
	n=sc.nextInt();
	int arr[][]=new int[m][n];
	

	for(i=0;i<=m;i++)
	{
	for(j=0;j<=n;j++)
	{
	arr[i][j]=sc.nextInt();
	}
	}

	



	for(i=0;i<=m;i++)
	{
	k=i;
	for(j=0;j<=n;j++)
	{
	System.out.println(arr[i][j]+" ");
	k--;
	}
}
}
}