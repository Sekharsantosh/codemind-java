import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
class Main {
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       float n=s.nextInt();
       float k=s.nextInt();
       float f=(n+k)/2;
       System.out.format("%.4f",f);
    }
  
}