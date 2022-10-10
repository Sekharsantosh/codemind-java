import java.util.Scanner;
class fahernheit{
    public static void main(String args[]){
        double n;
        Scanner s=new Scanner(System.in);
        n=s.nextFloat();
        double f=0;
        f=(n-32)*5/9;
        System.out.format("%.2f",f);
    }
}