import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{ 
		int num;
        boolean flag = false;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
	}
}

