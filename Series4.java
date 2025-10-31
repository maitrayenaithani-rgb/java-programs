import java.util.*;

public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 0; i <2* n; i++) {
            if (i % 2 == 0) { 
                sum = sum+a;
            }

            int c = a + b;
            int a = b;
            int b = c;
        }

        System.out.println("Sum of series at even indexes = " + sum);
       }
    }
