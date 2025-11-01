import java.util.*;
public class Automorphic {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int sq = i * i;
            if (sq % (int)Math.pow(10, (int)Math.log10(i) + 1) == i)
            System.out.print("Automorphic number");
        }
    }
}
