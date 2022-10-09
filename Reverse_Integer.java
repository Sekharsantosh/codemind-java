import java.util.Scanner;
class reverse{
    static void reverse(int n){
        int t=0,r,rev=0;
        t=n;
        if(t<0)
        {
            t=t*(-1);
        }
        while(t!=0)
        {
            r=t%10;
            rev=rev*10+r;
            t=t/10;
        }
        if(n<0)
        {
            rev=rev*(-1);
        }
        System.out.println(rev);
    }
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        reverse(n);
    }
}