import java.util.Scanner;
class ArraySmall{
public static void main(String args[]){
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of elements:");
n=sc.nextInt();
int[] a=new int[n];
System.out.println("enter the array elements:");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int small=a[0];
for(int i=0;i<n;i++)
{
if(a[i]<small)
{
small=a[i];
}
}
System.out.println("the smallest element in the array is:"+small);
}
}

