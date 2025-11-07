import java.util.*;
class ReverseArray {
    int[] arr;
    ReverseArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array");
        int n = sc.nextInt();
        arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Reversed array");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
      ReverseArray ob= new ReverseArray(); 
      ob.ReverseArray();
    }
