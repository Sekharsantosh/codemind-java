import java.util.Scanner;
class capacity{
    public static void main(String args[]){
        int t,se,b;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        se=s.nextInt();
        b=s.nextInt();
        System.out.println(2*(t*se*b*512));
    }
}