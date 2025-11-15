import java.util.*;
class ProductDigits {
     int n;

    ProductDigits() { 
    n = 0;
  }

    void getnum(int nn) { 
     n = nn; 
}
     int prod(int num) {
        if (num < 10) return num;
        return (num % 10) * prod(num / 10);
    }

    void show() {
        System.out.println("Product of digits = " + prod(n));
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ProductDigits ob= new ProductDigits();
    System.out.print("Enter number");
      int k=sc.nextInt();
      ob.getnum(k);
      ob.show();
    }
