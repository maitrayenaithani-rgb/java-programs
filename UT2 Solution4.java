import java.util.*;
class RotateArray {

    int arr[];
    int n;
    int d;

    RotateArray() {
        arr = 0;
        n = 0;
        d = 0;
    }

    void input() {
        Scanner sc = new Scanner(System.in); System.out.println("Enter size of array");
        n = sc.nextInt();
        arr = new int[n];        System.out.println("Enter " + n + " elements in array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }    System.out.println("Enter number of rotations");
        d = sc.nextInt();
    }
    void leftRotateOnce() {
        int f = arr[0];  
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];  
        }

        arr[n - 1] = f;  
    }

    void leftRotate() {
        for (int i = 0; i < d; i++) {
            leftRotateOnce();
        }
    }

    void display() {
        System.out.println("Array after rotation");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        RotateArray ob = new RotateArray();
        ob.input();
        ob.leftRotate();
        ob.display();
    }
}
