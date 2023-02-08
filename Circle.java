import java.util.*;
interface MyInterface
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int r=sc.nextInt();
public void method1();
public void method2();
}
class Squareandcircle implements MyInterface
{
public void method1 ()
{
double c;
c=4*a;
System.out.println("perimeter of square" +c);
}
public void method2()
{
double s;
s=2*3.14*r;
System.out.println("perimeter of cicle" +s);
}
}
class Circle implements MyInterface
{
public void method1()
{
double f=0;
f=a*a;
System.out.println("area of square" +f);
}
public void method2()
{
double g=0;
g=3.14*r*r;
System.out.println("area of circle" +g);
}
public static void main(String args[])
{
MyInterface obj1=new Circle();
MyInterface obj2=new Squareandcircle ();
obj1.method1();
obj2.method2();
obj2.method1();
obj2.method2();
}
}

