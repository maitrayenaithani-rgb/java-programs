import java.util.*;
public class Tribonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 1;
        int temp;
        System.out.print(a + " " + b + " " + c );
        for (int i = 4; i <= n; i++) {
            temp = a+b+c;   
            a = b;
            b = c; 
            c = temp;
            System.out.print(temp + " "); 
        }
    }
}
