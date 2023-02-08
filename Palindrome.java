import java.util.*;
class Palindrome
{
public static void main(String args[])
{
int n,r=0,s;
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
n=sc.nextInt();
int temp=n:
while(n>0)
{
s=n%10;
r=(r*10)+s;
n=n/10;
}
if(temp==r)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}
}



 

