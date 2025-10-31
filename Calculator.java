import java.util.*;
public class Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        int n2; 
        int choice;
        double res = 0;

        System.out.println("Enter integer n1 ");
        n1 = sc.nextInt();
 System.out.println("Enter integer n2 ");
        n2 = sc.nextInt(); System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");        System.out.println("Enter choice (1-4) ");
        choice = sc.nextInt();
        if (choice < 1 || choice > 4) {
 System.out.println("Invalid choice");
        } else {
            switch (choice) {
                case 1:
                    res = n1 + n2;
                    System.out.println("Answer is " + res);
                    break;
                case 2:
                    res = n1 - n2;
                    System.out.println("Answer is " + res);
                    break;
                case 3:
                    res = n1 * n2;
                    System.out.println("Answer is " + res);
                    break;
                case 4:
                    if (n2 != 0) {
                        res =  n1 / n2;  System.out.println("Answer is " + res);
                    } else {
                        System.out.println("Can't divide by zero");
                    }
                    break;
            }
        }
    }
}
