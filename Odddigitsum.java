import java.util.*;
public class SumOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n != 0){
            int d = n % 10;
            if(d % 2 != 0)
            sum = sum+d;
            n /= 10;
        }
        System.out.println("Sum of odd digits in a number is" + sum);
    }
}
