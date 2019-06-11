import java.io.*;
import java.util.*;
import java.lang.*;
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	Scanner s=new Scanner(System.in);
		double a,b,c;
	    a=s.nextDouble();
	    b=s.nextDouble();
	    c=a*b;
	//    String.format("%.5g%n",c);
		DecimalFormat df = new DecimalFormat("#0.#####");
df.format(c);
//	    System.out.print(c);
	}
}
