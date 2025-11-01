import java.util.*;
public class SumEvenDigits {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int d=n%10;
            if(d%2==0)
            sum+=d;
            n/=10;
}
        System.out.println("The suk of even numbers is"+sum);
    }
}
