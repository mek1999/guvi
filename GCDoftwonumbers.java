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
    while(n1!=n2)
    {
    	if(n1 > n2)
    	{
            n1-=n2;
    	}
        else
        {
        	n2-=n1;
        }
    }
    System.out.print(n1);
 }
}
