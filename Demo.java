interface MyInterface
{
public void method1();
public void method2();
}
class Demo implements MyInterface
{
public void method1()
{
System.out.println("metho1 is invoke");
}
public void method2()
{
System.out.println("method2 is invoked");
}
public static void main(String args[])                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               mi
{
MyInterface obj=new Demo();
obj.method1();
obj.method2();
}
}
