import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String n;
        Scanner s = new Scanner(System.in);
        n = s.nextLine();
       boolean numeric = true;
       try
       {
            Double num = Double.parseDouble(n);
        } 
        catch (NumberFormatException e) 
        {
            numeric = false;
        }

        if(numeric)
        {
            System.out.println( "yes");
        }
        else
        {
            System.out.println("No");
        }
	}
	
}
