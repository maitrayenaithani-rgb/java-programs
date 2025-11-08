import java.util.*;
class Fact {
    Fact(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f = f*i;
        }
        System.out.println("Factorial of " + num + " is: " + f);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find factorial");
        int n = sc.nextInt();
        Fact f = new Fact(n);
    }
}
