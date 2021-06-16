import java.util.Scanner;
class ArrayOdd{
public static void main(String args[]){
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of elements");
n=sc.nextInt();
int[] a=new int[10];
System.out.println("enter the elements:");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("The array elemts in odd position are:");
for(int i=0;i<n;i=i+3)
{
System.out.println(a[i]);
}
}
}
