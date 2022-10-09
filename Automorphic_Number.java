import java.util.Scanner;
class circular_prime{
    static int size(int n){
        int t,r,s,k;
        t=n;
        s=1;
        k=10;
        while(t!=0)
        {
            r=t%10;
            s*=k;
            t=t/10;
        }
        return s;
    }
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int t=0;
        t=n*n;
        int k=size(n);
        int d=t%k;
        if(n==d)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not an Automorphic Number");
        }
        
    }
}