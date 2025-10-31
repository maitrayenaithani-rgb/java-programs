import java.util.*;
public class Lucas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     System.out.print("Enter number of terms (n) ");
        int n = sc.nextInt();

        int a = 2;
        int b = 1;
        int c; 
      
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
         System.out.print(c + " ");
        }
      }
    }
