import java.util.*;
public class Automorphic {
    public static void main(String args[]) 
{
    Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n * n;
        System.out.println(sq % (int)Math.pow(10, (int)Math.log10(n)+1) == n ? "Automorphic" : "Not");
    }
}
