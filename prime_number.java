import java.util.Scanner;
class prime{
    static int is_prime(int n){
        int k=1;
        if(n==1){
            k=0;
        }
        else if(n>1){
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    k=0;
                }
            }
        }
        return k;
    }
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if(is_prime(n)==1)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not a prime");
        }
    }
}