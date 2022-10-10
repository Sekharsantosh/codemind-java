import java.util.Scanner;
class Strong_number{
    static int fact(int n){
        int t=0,k=0;
        t=n;
        if(t==1)
        {
            k=t;
        }
        else if(n==0)
        {
            k=1;
        }
        else 
        {
            k=t*fact(t-1);
        }
        return k;
    }
    static int strong(int n){
        int r,s=0,t=0;
        t=n;
        while(t!=0)
        {
            r=t%10;
            s=s+fact(r);
            t=t/10;
        }
        return s;
    }
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int m=0;
        m=strong(n);
        if(m==n)
        {
            System.out.println("The number "+n+" is a strong number");
        }
        else
        {
             System.out.println("The number "+n+" is not a strong number");
        }
    }
}