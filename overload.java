import java.util.Scanner;
class A
{

void show()
{
System.out.print("SHOW");

}

}
class B extends A
{

void show(int a,double c)
{
System.out.print(a+c);

}}
class one
{
public static void main(String[] args)
{
B b=new B();
b.show();
b.show(10,2.3);
}


}