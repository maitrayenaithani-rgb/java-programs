import java.util.*;
public class Volume
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Volume of cuboid");
        System.out.println("Enter 2 for Volume of cylinder");
        System.out.println("Enter 3 for Volume of cone");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();
        
        switch(choice) {
            case 1:
                System.out.print("Enter length of cuboid: ");
                double l = in.nextDouble();
                System.out.print("Enter breadth of cuboid: ");
                double b = in.nextDouble();
                System.out.print("Enter height of cuboid: ");
                double h = in.nextDouble();
                double vol = l * b * h;
                System.out.println("Volume of cuboid = " + vol);
                break;
                
            case 2:
                System.out.print("Enter radius of cylinder: ");
                double rCylinder = in.nextDouble();
                System.out.print("Enter height of cylinder: ");
                double hCylinder = in.nextDouble();
                double vCylinder = (22 / 7.0) * Math.pow(rCylinder, 2) * hCylinder;
                System.out.println("Volume of cylinder = " + vCylinder);
                break;
                
            case 3:
                System.out.print("Enter radius of cone: ");
                double rCone = in.nextDouble();
                System.out.print("Enter height of cone: ");
                double hCone = in.nextDouble();
                double vCone = (1 / 3.0) * (22 / 7.0) * Math.pow(rCone, 2) * hCone;
                System.out.println("Volume of cone = " + vCone);
                break;
                
            default:
                System.out.println("Invalid choice. Please select from 1 or 2 or 3.");
        }
    }
}
