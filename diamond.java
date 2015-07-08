import java.util.Scanner;
class diamond

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
System.out.print(" ");
for(int i=0;i<n-1;i++)
{
for(int l=0;l<i+1;l++)
{System.out.print(" ");
}
for(int m=n-i*2;m>0;m--)
{
System.out.print("*");
}

System.out.println();

}}}
