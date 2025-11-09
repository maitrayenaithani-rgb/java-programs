import java.util.*;
class SumOfDigits {
    int num;
    SumOfDigits(int n) {
        num = n;
    }

    void calculate() {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits = " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        SumOfDigits ob = new SumOfDigits(n);
        ob.calculate();
    }
}
