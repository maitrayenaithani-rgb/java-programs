import java.util.Scanner;
public class SumEven {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=2;i<=2*n;i+=2){
        sum+=i;
        System.out.println("The sun of even numbers is"+sum);
    }
  }
}
