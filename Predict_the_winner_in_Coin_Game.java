import java.util.Scanner;
class palindrome{
    public static void main(String args[]){
        int n,m;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=s.nextInt();
        if((n%2==0 && m%2==0) || (n%2==0) ||(m%2==0))
        {
            System.out.println("Player 1");
        }
        else
        {
            System.out.println("Player 2");
        }
    }
}