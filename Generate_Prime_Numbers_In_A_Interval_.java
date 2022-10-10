import java.util.Scanner;
import java.lang.*;
class sum_and_product{
    static int  prime(int n)
    {
        int k=1;
        if(n==1)
        {
            k=0;
        }
        else if (n>1)
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    k=0;
                }
            }
        }
        return k;
    }
    public static void main(String args[]){
        int n,k,m;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=s.nextInt();
        for(int i=n;i<m;i++)
        {
            if(prime(i)==1)
            {
                System.out.println(i);
            }
        }
    }
}