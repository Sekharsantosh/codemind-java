import java.util.Scanner;
class disarium{
    static int length(int n){
        int r,k=0,t=0;
        t=n;
        while(t!=0)
        {
            r=t%10;
            k=k+1;
            t=t/10;
        }
        return k;
    }
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int k=0;
        k=length(n);
        int r,t=0;
        double l=0;
        t=n;
        while(t!=0)
        {
            r=t%10;
            l=l+(Math.pow(r,k));
            t=t/10;
            k-=1;
        }
        int d=(int)Math.round(l);
        if(n==d)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}