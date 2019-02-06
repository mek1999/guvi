import java.util.Scanner;
class Check_Leap_Year 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        boolean flag = false;
        if(year % 400 == 0)
        {
            flag = true;
        }
        else if (year % 100 == 0)
        {
            flag = false;
        }
        else if(year % 4 == 0)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        if(flag)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
