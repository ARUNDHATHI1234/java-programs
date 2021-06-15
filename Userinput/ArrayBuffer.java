import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class ArrayBuffer
{
public static void main(String args[])
throws IOException{
int n;
BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the number of elements");
n=Integer.parseInt(reader.readLine());;
int[] a=new int[n];
System.out.println("enter the elements:");
for(int i=0;i<n;i++)
{
a[i]=Integer.parseInt(reader.readLine());;
}
System.out.println("The array elemts are:");
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}
