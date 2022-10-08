import java.util.Scanner;
class sum{
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        int a,b,c;
        n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            a=s.nextInt();
            b=s.nextInt();
            System.out.println(a+b);
        }
    }
}