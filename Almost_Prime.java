import java.util.Scanner;
class prime{
    static int isPrime(int n){
        int i,j;
        int k=1;
        if (n==1){
            k=0;
        }
        else if(n>1)
        {
         for(i=2;i<=Math.sqrt(n);i++)
         {
            if (n%i==0)
            {
                k=0;
            }
         }
        }
        return k;
    }
   static int almostPrime(int a){
       int j,k=0;
       int i;
       for(i=2;i<a-1;i++)
       {
           for (j=i+1;j<a;j++)
           {
               if(i!=j)
               {
                if(isPrime(i)==1)
                  {
                   if(isPrime(j)==1)
                   {
                     if(i*j==a)
                     {
                       k=1;
                       break;
                     }
                    }
                    
                   }
               }
               else
                    {
                        k=0;
                        break;
                    }
           }
       }
       return k;
   }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n,i;
        n=s.nextInt();
        for(i=0;i<n;i++)
        {
            int a;
            a=s.nextInt();
           // System.out.println(a);
            if(almostPrime(a)==1)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            
        }
    }
}