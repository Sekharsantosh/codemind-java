import java.util.Scanner;
class area{
    public static void main(String args[]){
        double a,b,c;
        Scanner s=new Scanner(System.in);
        a=s.nextFloat();
        b=s.nextFloat();
        c=s.nextFloat();
        double r=0,d=0;
        r=(a+b+c)/2;
        d=Math.sqrt(r*(r-a)*(r-b)*(r-c));
        System.out.format("%.2f",d);
    }
}