package pack2;
import java.util.*;
import java.util.Scanner;


public class cal2
{
	public void display()
	{
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter values of a and b: ");
	a= sc.nextInt();
	b= sc.nextInt();
	c=a*b;
	System.out.println("multiplication of a and b is: " + c);
	}
}
