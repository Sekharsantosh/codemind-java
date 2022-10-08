import java.util.Scanner;
class largest_digit_of_a_number{
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int r,t=0,k=0;
        t=n;
        while (t!=0)
        {
            r=t%10;
            if(k<r)
            {
                k=r;
            }
            t=t/10;
        }
        System.out.println(k);
    }
}