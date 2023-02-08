import java.util.Scanner;
class EgSuper
{
String color="blue";
double  AreaOfcircle(double r)
{
double area;
area=3.14*r*r;
return (area);
}
}
class EgChild1 extends EgSuper
{
public static void main(String args[])
{
double r;
String c;
Scanner s=new Scanner(System.in);
EgChild1 e=new EgChild1();
System.out.println("enter the radius of circle");
r=s.nextDouble();
c=e.color;
System.out.println(c);
System.out.println("Area of circle"+e.AreaOfcircle(r));
}
}
