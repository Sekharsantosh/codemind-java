import java.util.Scanner;
class circular_prime{
    static int reverse(int n){
        int t,r,rev=0;
        t=n;
        while(t!=0)
        {
            r=t%10;
            rev=rev*10+r;
            t=t/10;
        }
        return rev;
    }
    static int prime(int n){
        int k=1;
        if(n==1)
        {
            k=0;
        }
        else if(n>1)
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    k=0;
                }
            }
        }
        else
        {
            k=1;
        }
        return k;
    }
    static void circularPrime(int n){
        int k=0,t=0,l=0;
        k=reverse(n);
        if(prime(n)==1)
        {
            if(prime(k)==1)
            {
                System.out.println("circular prime");
            }
            else
            {
                System.out.println("prime but not a circular prime");
            }
        }
        else
        {
            System.out.println("not prime");
        }
    }
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        circularPrime(n);
    }
}