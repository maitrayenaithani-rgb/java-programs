import java.util.*;
public class Buzz {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in");
    System.out.print("Enter a number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 10 == 7 || i % 7 == 0){
                System.out.println(i + " is a Buzz Number");
        }else{
        System.out.println("Not a buzz number");
    }
  }
}
