import java.util.Scanner;
abstract class Abstract
{
int a=50;
public abstract method1();
public abstract method2();
public void concretemethod()
{
Sysyem.out.println("concrete method is invoked");
}
}
class EgAbstract extends Abstract
{
public void method1()
{
System.out.println("method1 is invoked");

}
public void method2()
{
System.out.println("method2 is invoked");
}
public static void main(String args[])
{
EgAbstract eg=new EgAbstract();
eg.method1();
eg.method2();
eg.concretemethod();
sysyem.out.println(eg.a);
}
}
