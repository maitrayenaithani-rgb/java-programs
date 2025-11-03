import java.util.*;
public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number ");
        int m= sc.nextInt();
        int count = 0;
        for (int i=0;i<n;i++) {
            if (arr[i] == m)
                count++;
        }

        System.out.println("Frequency of " + m + " = " + count);

        
    }
}
