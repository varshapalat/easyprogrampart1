import java.util.Scanner;
class prime
{
public static void main(String [] args)
{
System.out.print("n=");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
generate(n);
}

static void generate(int n)
{
 int i;
for(i=2;i<n/2;i++)
{
if (n%i==0 && isprime(i))
{
System.out.print(i+", ");
}
}
}
static boolean isprime(int n)
{
for(int i=2;i<n;i++)
{if(n%i==0)
{return false; 
}}
return true;
}
} 
