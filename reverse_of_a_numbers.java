import java.util.Scanner;
class reverse_of_a_number{
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int rev=0,r,t=0;
        t=n;
        while (t!=0)
        {
            r=t%10;
            rev=rev*10+r;
            t=t/10;
        }
        System.out.println(rev);
    }
}