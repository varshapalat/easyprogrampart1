import java.util.Scanner;
class isotri
{
public static void main(String [] args)
{
System.out.print("n=");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
for(int j=n-i;j>0;j--)
{
System.out.print(" ");
}
for(int k=0;k<i*2+1;k++)
{
System.out.print("*");
}System.out.println();
}
}}
