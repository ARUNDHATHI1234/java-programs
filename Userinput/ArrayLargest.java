import java.util.Scanner;
class ArrayLargest 
{
public static void main(String[] args) 
{
int n;
Scanner sc= new Scanner(System.in);
System.out.println("Enter number of elements in the array:");
n=sc.nextInt();
int[]  a=new int[n];
System.out.println("Enter elements of array:");
for(int i = 0;i<n;i++)
{
a[i]=sc.nextInt();
}
int large=a[0];
for(int i = 0;i<n;i++)
{
if(large<a[i])
{
large=a[i];
}
}
System.out.println("the largest element is:"+large);
}
}