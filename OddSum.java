import java.util.*;
public class SumOddDigits {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int d=n%10;
            if(d%2!=0){
            sum+=d;
            n/=10;
        }
        System.out.println("The sum of odd digits is"+sum);
    }
}
