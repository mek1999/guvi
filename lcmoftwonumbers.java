import java.util.*;
import java.lang.*;
import java.io.*;
public class Ideone 
{
 public static void main(String[] args) 
 {
 	Scanner s=new Scanner(System.in);
 	int n1,n2,lcm;
 	n1=s.nextInt();
 	n2=s.nextInt();
    lcm=(n1>n2)?n1:n2;
    while(true)
    {
       if((lcm%n1)==0&&(lcm%n2)==0)
       {
          System.out.print(lcm);
          break;
       }
       ++lcm;
    }
 }
}
