import java.util.Scanner;
class Mega_Prime{
    static int prime(int n){
        int k;
        k=1;
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
        return k;
    }
    static void megaPrime(int n)
    {
        int t=0,r;
        if(prime(n)==1)
        {
           while(n!=0)
           {
              r=n%10;
              if(prime(r)==1)
              {
                  t=1;
              }
              else
              {
                  t=0;
                  break;
              }
              n=n/10;
           }
        }
        if(t==1)
        {
            System.out.println("Mega Prime");
        }
        else
        {
            System.out.println("Not Mega Prime");
        }
    }
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        megaPrime(n);
    }
}