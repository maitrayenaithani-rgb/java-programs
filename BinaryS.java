
import java.util.*;
public class BinaryS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements");
        int x= sc.nextInt();
        int[] arr = new int[x];

        System.out.println("Enter " + size + " sorted elements");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search");
        int n = sc.nextInt();
        int start = 0;
        int end= size - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == n) {
                System.out.println("Element found at index" + mid);
                return; 
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    
        System.out.println("Element not found.");
        }
    }
