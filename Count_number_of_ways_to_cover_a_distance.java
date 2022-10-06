import java.io.*;
import java.util.Scanner;
class ground
{
    static int Count(int dist)
    {
        if (dist<0)   
            return 0;
        if (dist==0)   
            return 1;
        return Count(dist-1) +Count(dist-2) +Count(dist-3);
    }
     
    public static void main (String[] args)
    {
        int dist;
        Scanner s=new Scanner(System.in);
        dist=s.nextInt();
        System.out.println(Count(dist));
    }
}