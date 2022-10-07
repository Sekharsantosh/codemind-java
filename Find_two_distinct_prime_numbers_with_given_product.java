import java.util.Scanner;
class Prime{
    static int isPrime(int n)
    {
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
        return k;
    }
    static void increment(int n)
    {
        int k,l=0,s=0;
        k=0;
        for(int j=2;j<n;j++)
        {
          for(int i=n-1;i>1;i--)
          {
             if(i!=j) 
               if( i*j==n)
                  if(isPrime(i)==1 && isPrime(j)==1)
                 {
    
                      k=i;
                      l=j;
                      s=1;
                      break;
               }
           } 
        }
            
       if(s==1)
        {
            System.out.println(String.format("%d %d",k,l));
        }
        else
        {
            System.out.println("-1");
        }

        
    }
    public static void main(String args[])
    {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        increment(n);
     
    }
}