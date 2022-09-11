import java.util.*;
class area
{
    public static void main(String[] args)
    {
        int r;
        double pi=3.14,ar;
        Scanner sc=new Scanner(System.in);  
        r=sc.nextInt();
        ar=pi*r*r;
        System.out.printf("%.2f",ar);
    }
}