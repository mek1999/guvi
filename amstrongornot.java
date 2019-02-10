import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int c=0,a,temp;  
    int n;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    temp=n;  
    while(n>0)  
    {  
       a=n%10;  
       n=n/10;  
       c=c+(a*a*a);  
    }  
    if(temp==c)  
    {
    	System.out.println("yes");   
    }
    else  
     {
     	System.out.println("no");  
     }
	}
}
