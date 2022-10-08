import java.util.Scanner;
class fibonacci{
    static int fib(int n){
        int f1=0,f2=1,f3=f1+f2,k=0;
        int i=0;
        while(i<=n)
        {
            f1=f2;
            f2=f3;
            f3=f1+f2;
            if(f1==n)
            {
               k=f1;
               break;
            }
            i+=1;
        }
        return k;
    }
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if(n==fib(n))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}