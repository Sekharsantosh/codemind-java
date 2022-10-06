import java.util.Scanner;
class palindrome{
    static int isPalindrome(int n){
        int rev=0;
        int t=0,r,k=0;
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
            return k;
        }
        else
        {
            k=0;
            return k;
        }
    }
    public static void main(String args[]){
        int n,k;
        int c=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            if(isPalindrome(a[i])==1)
            {
                c=c+1;
            }
        }
        
        System.out.println(c);
    }
}