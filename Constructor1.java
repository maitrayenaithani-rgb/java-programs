import java.util.*;
class ArraySum {
    int[] arr;
    int sum = 0;
    ArraySum() {
        Scanner sc = new Scanner(System.in);
        arr = new int[5];
        System.out.println("Enter 5 nymebrs in the array");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum =sum+arr[i];
        }
    }

    void display() {
        System.out.println("Sum of array elements = " + sum);
    }

    public static void main(String[] args) {
        ArraySum ob = new ArraySum();
        ob.display();
    }
}
