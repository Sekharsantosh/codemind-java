import java.util.Scanner;
class fahernheit{
    public static void main(String args[]){
        double p,r,t;
        Scanner s=new Scanner(System.in);
        p=s.nextFloat();
        r=s.nextFloat();
        t=s.nextFloat();
        double ci=0;
        ci=p*(Math.pow(1+(r/100),t));
        System.out.format("%.2f",ci);
    }
}