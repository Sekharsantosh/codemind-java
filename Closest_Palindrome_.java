import java.util.Scanner;
class palindrome{
    static int isPalindrome(int n){
        int t=n,k=0;
        int rev=0,r;
        while(t!=0)
        {
            r=t%10;
            rev=rev*10+r;
            t=t/10;
        }
        if (n==rev)
        {
            k=1;
        }
        else
        {
            k=0;
        }
        return k;
    }
    static int increment(int n){
        int k=0;
        while(n!=0)
        {
            n=n+1;
            if(isPalindrome(n)==1)
            {
                k=n;
                break;
            }
        }
        return k;
    }
    static int decrement(int n){
        int k=0;
        while(n!=0)
        {
            n=n-1;
            if(isPalindrome(n)==1)
            {
                k=n;
                break;
            }
        }
        return k;
    }
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int t,d,k=n;
        t=increment(k);
        d=decrement(k);
        if(n-d<t-n)
            System.out.println(d);
        else if(n-d>t-n)
            System.out.println(t);
        else if(n-d==t-n)
           System.out.println(String.format("%d %d",d,t));
    }
}