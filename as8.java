import java.util.*;
public class as8{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks of three subjects");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int sum=a+b+c;
System.out.println("Total marks: "+sum);
float per=sum/3;
System.out.println("Percentage: "+per);
}
}