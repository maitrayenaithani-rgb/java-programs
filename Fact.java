import java.util.*;
public class FactSeries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n");
        int n = sc.nextInt();
        int sum = 0;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;   
            sum = sum + fact; 
        }

        System.out.println("Sum of Series of factorials till nth term is = " + sum);
        
    }
}
