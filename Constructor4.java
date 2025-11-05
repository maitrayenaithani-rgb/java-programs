import java.util.*;
class Rectangle {
    int l;
    int b;
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void display() {
        int a= l * b;
        int p = 2 * (l + b);
        System.out.println("Area " + a);
        System.out.println("Perimeter = " + p);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        Rectangle r = new Rectangle(l, b);
        r.display();
    }
}
