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
    
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if(isPalindrome(n)==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}