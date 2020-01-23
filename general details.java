import java.io.*;
import java.util.*;
class HelloWorld
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String name=s.nextLine();
    String city=s.nextLine();
    int age=s.nextInt();
    float height=s.nextFloat();
    boolean marry=s.nextBoolean();
    char sex=s.nextLine();
    double population=s.nextDouble();
    System.out.println("Name:"+name);
    System.out.println("City:"+city);
    System.out.println("Age:"+age);
    System.out.println("Height:"+height);
    System.out.println("Married:"+marry);
    System.out.println("Sex:"+sex);
    System.out.println("City Population:"+population);
  }
}
