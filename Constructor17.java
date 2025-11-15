import java.util.*;
class HexaDeci {
    private int n;
    private String hex;

    HexaDeci() {
        n = 0;
        hex = "";
    }

    void getnum(int nn) {
        n = nn;
    }

    private String convert(int num) {
        if (num == 0)
            return "";
        String digits = "0123456789ABCDEF";
        return convert(num / 16) + digits.charAt(num % 16);
    }

    void deci_hex() {
        if (n == 0)
            hex = "0";
        else
            hex = convert(n);
    }

    void show() {
        System.out.println("Decimal = " + n);
        deci_hex();
        System.out.println("Hexadecimal = " + hex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HexaDeci obj = new HexaDeci();

        System.out.print("Enter decimal number");
        ob.getnum(sc.nextInt());
        ob.show();
    }
}

