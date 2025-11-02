import java.util.*;
public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for KM to Miles");
        System.out.println("Enter 2 for Celsius to Fahrenheit");
        System.out.println("Enter 3 for Kg to Pounds");
        System.out.print("Choose conversion: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: 
                System.out.print("Enter kilometers: ");
                double km = sc.nextDouble();
                System.out.println("Miles = " + (km * 0.621371));
            
            case 2:
                System.out.print("Enter Celsius: ");
                double c = sc.nextDouble();
                System.out.println("Fahrenheit = " + ((c * 9 / 5) + 32));
            
            case 3: 
                System.out.print("Enter kilograms: ");
                double kg = sc.nextDouble();
                System.out.println("Pounds = " + (kg * 2.20462));
            
            default -> System.out.println("Invalid choice!");
        }
    }
}
