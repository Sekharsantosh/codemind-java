import java.util.Scanner;
class Happy_number{
    static int happy(int n){
        int k=0,r,t=0,j=0;
        t=n;
        while(t!=0)
        {
            r=t%10;
            k=k+r*r;
            t=t/10;
        }
        n=k;
        if(n<=9)
        {
            return n;
        }
        else
        {
            return happy(n);
        }
    }
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if(happy(n)==1 || happy(n)==7)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}