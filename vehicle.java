import java.util.Scanner;
abstract class vehicle
{

abstract void start();

void stop()
{
	System.out.print(" Vehicle Stop");
	
}

}
class twowheeler extends vehicle
{

void  start()
{

System.out.print("Start");

}
void stop()
{
	
	System.out.print("Stop");
}


}
class fourwheeler extends vehicle
{


void  start()
{

System.out.print("Start");
}
void stop()
{
	System.out.print("Stop");
	
}

}
class one
{
public static void main(String[] args)
{
 twowheeler d=new  twowheeler ();
d.start();
d.stop();

 fourwheeler e=new  fourwheeler ();
e.start();
e.stop();

}
}
