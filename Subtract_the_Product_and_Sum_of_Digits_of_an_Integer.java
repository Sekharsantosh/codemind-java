import java.util.Scanner;
import java.lang.*;
class sum_and_product{
    static int  sum_pro(int a)
    {
        int k=0;
        int t=0,r,p=1;
        t=a;
        k=0;
        while(t!=0)
        {
            r=t%10;
            k+=r;
            p*=r;
            t=t/10;
        }
        return Math.abs(k-p);
    }
    public static void main(String args[]){
        int n,m;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int k=sum_pro(n);
        System.out.println(k);
    }
}