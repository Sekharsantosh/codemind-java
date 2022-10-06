import java.util.Scanner;
class area{
    public static void main(String args[]){
      Scanner s=new Scanner(System.in);
      int n,m,k;
      n=s.nextInt();
      m=s.nextInt();
      k=n%m;
      System.out.println(k);
    }
}