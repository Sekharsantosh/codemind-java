import java.util.Scanner;
class closest_prime{
    static int prime(int n){
        int t=1;
        if(n==1)
        {
            t=0;
        }
        else if(n>1)
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    t=0;
                }
            }
        }
        return t;
    }
    static int min(int n)
    {
        int t=0;
        int k=0;
        t=n;
        if(t>0)
         while(t!=0)
         {
            if(prime(t)==1)
            {
                k=t;
                break;
            }
            else
            {
                t=t-1;
            }
          }
         else
             k=0;
        return k;
    }
    static int max(int n){
        int t=0,k=0;
        t=n;
        while(n!=0)
        {
            if(prime(t)==1)
            {
                k=t;
                break;
            }
            else
            {
                t=t+1;
            }
            n-=1;
        }
        return k;
    }
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int mi=0,mx=0;
        mi=min(n);
        mx=max(n);
        /*System.out.println(n);
        System.out.println(mx);
        System.out.println(mi);*/
        if(n-mi<mx-n)
        {
            System.out.println(n-mi);
        }
        else
        {
             System.out.println(mx-n);
        }
    }
}