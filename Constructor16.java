import java.util.*;
class SumDigit {
    int n;

    SumDigit() {
        n = 0;
    }

    void getnum(int num) {
        n = num;
    }

    int sumRec(int x) {
        if (x == 0)
            return 0;
        else
            return (x % 10) + sumRec(x / 10);
    }

    void show() {
        System.out.println("Number " + n);
        System.out.println("Sum of digits" + sumRec(n));
    }

    public static void main(String[] args) {
        SumDigit obj = new SumDigit();
        obj.getnum(9876);
        obj.show();
    }
}

