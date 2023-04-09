import java.util.*;
public class as15{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();

int flipped=a^b;

int count=0;
while(flipped!=0){
	int rsb=(flipped & -flipped);
	flipped -= rsb;
	count++;
}
System.out.println(count);
}
}	