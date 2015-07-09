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
//System.out.print(" ");
for(int i=1;i<n;i++)
{
System.out.print(" ");
for(int l=i;l>0;l--)
{System.out.print(" ");
}
for(int m=(n-1)*2-1;m>(i-1)*2;m--)
{
System.out.print("*");
}

System.out.println();

}}}
