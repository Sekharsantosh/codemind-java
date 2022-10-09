import java.util.Scanner;
class fibonacci{
    static void fib(int n){
        int f1=0,f2=1,f3=f1+f2;
        int k,t;
        k=0;
        t=0;
        while(f1<n)
        {
            f1=f2;
            f2=f3;
            f3=f1+f2;
            if(f1<n)
            {
                k=f1;
            }
            if(f1>n)
            {
                t=f1;
            }
        }
        if(n-k<t-n)
            System.out.println(k);
        else if(n-k>t-n)
            System.out.println(t);
        else
             System.out.format("%d %d",k,t);
    }
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        fib(n);
        
    }
}