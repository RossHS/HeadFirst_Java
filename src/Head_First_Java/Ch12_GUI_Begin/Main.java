import java.util.*;


public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        StringBuilder s = new StringBuilder("#");
        byte a=1;
        boolean t=false;
        while(true)
        {
            if(!t)
            {
                s.append("#");
                a++;
            }
            if(a==40)
            {
                t=true;
            }
            if(a==0)
                t=false;
            if(t)
            {
                s.deleteCharAt(s.length()-1);
                a--;
            }
            System.out.println(s);
            Thread.sleep(100);
        }
    }
}