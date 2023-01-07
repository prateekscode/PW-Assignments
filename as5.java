import java.util.*;
public class as5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int n=sc.nextInt();
		System.out.println("Enter the second number");
		int n1=sc.nextInt();
		int c;
		c=n;
		n=n1;
		n1=c;
		System.out.println("After swapping the first number is: "+n);
		System.out.println("After swapping the second number is : "+n1);
	}
}