import java.util.Scanner;
import java.lang.*;
class sum_of_digits{
    public static void main(String args[]){
        int n,k,m;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        k=s.nextInt();
        m=s.nextInt();
        if(n>50 && k>60 && m>100)
        {
            System.out.println("10");
        }
        else if(n>50 && k>60 && m<100)
        {
            System.out.println("9");
        }
        else if(n<50 && k>60 && m>100)
        {
            System.out.println("8");
        }
        else if(n>50 && k<60 && m>100)
        {
            System.out.println("7");
        }
        else if(n>50 || k>60 || m>100)
        {
            System.out.println("6");
        }
        else
        {
            System.out.println("5");
        }
    }
}