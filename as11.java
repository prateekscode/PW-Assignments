import java.util.*;
public class as11{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.");
		int x=sc.nextInt();
		int n=8+x;
		int m=n/3;
		int r=m%5;
		int ans=r*5;
		System.out.println(ans);
	}
}