import java.util.Scanner;
import java.lang.*;
class sum_of_digits{
    static int add_digits(int n){
        int t=0,r,k=0,s=0;
        t=n;
        while(t!=0)
        {
            r=t%10;
            s=s+r;
            t=t/10;
        }
        if(s<9)
        {
            k=s;
        }
        else
        {
            return add_digits(s);
        }
        return k;
    }
    public static void main(String args[]){
        int n,k,m;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        k=add_digits(n);
        System.out.println(k);
    }
}