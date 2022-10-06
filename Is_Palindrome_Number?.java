import java.util.Scanner;
class palindrome{
    static int isPalindrome(int n){
        int rev=0;
        int r,t=0,k=0;
        t=n;
        while(t!=0)
        {
            r=t%10;
            rev=rev*10+r;
            t=t/10;
        }
        if(n==rev)
        {
            k=2;
            return k;
        }
        else{
            k=1;
            return k;
        }
    }
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int k=isPalindrome(n);
        System.out.println(k);
        
    }
}