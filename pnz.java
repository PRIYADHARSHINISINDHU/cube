import java.io.*;
import java.util.*;
class pnz
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
n=s.nextInt();
if(n<0)
{
System.out.println("The number is negative");
}
if(n==0)
{
System.out.println("The number is zero");
}
if(n>0)
{
System.out.println("The number is positive");
}
}
}
