import java.util.Scanner;
class fibonacci{
    static void fib(int n){
        int f1=0,f2=1,f3=f1+f2,k=0;
        int i=0;
        System.out.format("%d ",f1);
        while(i<n-1)
        {
            f1=f2;
            f2=f3;
            f3=f1+f2;
            System.out.format("%d ",f1);
            i+=1;
        }
    }
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        fib(n);
    }
}