import java.util.Scanner;
class Palindrome{
    static int palindrome(int n)
    {
        int t=0,r,rev=0,k=0;
        t=n;
        while(t!=0)
        {
            r=t%10;
            rev=rev*10+r;
            t=t/10;
        }
        if(n==rev)
        {
            k=1;
        }
        return k;
    }
    public static void main(String args[])
    {
        int n,m;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=s.nextInt();
        for(int i=n;i<=m;i++)
        {
            if(palindrome(i)==1)
            {
                System.out.format("%d ",i);
            }
        }
    }
}