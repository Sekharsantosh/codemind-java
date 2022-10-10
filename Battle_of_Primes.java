import java.util.Scanner;
class factorial{
    static int cprime(int a){
       int k=1;
       if(a==1)
       {
           k=0;
       }
       else if(a>1)
       {
           int i=0;
           for(i=2;i<=Math.sqrt(a);i++)
           {
               if(a%i==0)
               {
                   k=0;
               }
           }
       }
       return k;
    }
    static void prime(int n)
    {
        int t=0,k=0,i=1;
        t=n;
        int s=n;
        //System.out.println(t);
        while(s>0)
        {
            
            s-=1;
            if(cprime(t+i)==1)
            {
               System.out.println(i);
               break;
            }
            else
             {
               i+=1;
             }
        }
        
    }
    public static void main(String args[]){
        int n,m;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=s.nextInt();
        int l=m+n;
        prime(l);
    }
}