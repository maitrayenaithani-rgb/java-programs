import java.util.*;

class PowerCalc
{
    int x;
    int y;
    int p;

    PowerCalc() {
        x = 0;
        y = 0;
        p = 1;
    }

    void getnum(int base, int exp) {
        x = base;
        y = exp;
    }

    int power(int a, int b) {
        if (b == 0)
            return 1;
        return a * power(a, b - 1);
    }

    void compute() {
        p = power(x, y);
    }

    void show() {
        System.out.println("Base" + x + ", Exponent: " + y);
        compute();
        System.out.println("Result (x^y) " + p);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        PowerCalc ob = new PowerCalc();
        System.out.print("Enter base ");
        int a = sc.nextInt();
        System.out.print("Enter exponent");
        int b = sc.nextInt();
        ob.getnum(a, b);
        ob.show();
    }
}
