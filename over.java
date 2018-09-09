import java.util.Scanner;
class animal
{
String breed;
String colour;

void speak()
{
System.out.print("Speak");

}

}
class dog extends animal
{

void speak()
{
System.out.print("Dog");

}
}
class cat extends animal
{

void speak()
{
System.out.print("Cat");

}


}
class one
{
public static void main(String[] args)
{
dog d=new dog ();
d.speak();

cat e=new cat ();
e.speak();

}
}
