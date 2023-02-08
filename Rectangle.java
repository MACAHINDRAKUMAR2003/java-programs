import java.util.*;
interface MyInterface
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
public void area();
public void perimeter();
}
class Rectangle implements MyInterface
{
public void perimeter()
{
int c=0;
c=2*(a+b);
System.out.println("perimeter of rectangle" +c);
}
public void area()
{
int d=0;
d=a*b;
System.out.println("perimeter of area" +d);
}
public static void main(String args[])
{
MyInterface obj=new Rectangle();
obj.area();
obj.perimeter();
}
}




