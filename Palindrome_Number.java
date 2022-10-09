import java.util.Scanner;
class Palindrome{
    static int palindrome(int n){
        int t,r,rev=0,k=0;
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
        if(n==rev)
        {
           k=1; 
        }
        else
        {
            k=0;
        }
        return k;
    }
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int a;
            a=s.nextInt();
            if(palindrome(a)==1)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}