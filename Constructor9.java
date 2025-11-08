import java.util.*;

class Palindrome {
    Palindrome(int num) {
        int n= num;
        int rev = 0;
        
        while (num != 0) {
            int d = num % 10;
            rev= rev * 10 + d;
            num = num / 10;
        }
        
        if (n== rev) {
            System.out.println(n + " is a palindrome");
        } else {
            System.out.println(n + " is not a palindrome");
 }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = sc.nextInt();
        Palindrome ob=new Palindrome(num);
    }
}
