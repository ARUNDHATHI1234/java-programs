import java.util.Scanner;
public class ArrayReverse{  
public static void main(String[] args) {  
int n;
Scanner sc=new Scanner(System.in);
int [] a=new int[10];
System.out.println("enter the no of elements:");
n=sc.nextInt();
System.out.println("enter the array elements:");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("the array elements are:");
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("Array in reverse order:");
for(int i=n-1;i>=0;i--)
{
System.out.println(a[i]);
}
}
}


 
       