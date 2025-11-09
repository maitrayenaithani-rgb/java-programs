import java.util.*;
class Array {
    int[] arr;
    Array(int[] a) {
        arr = a;
    }

    void find() {
        int min = arr[0];
        int max = arr[0];
        for (int i=0;i<arr.length;i++) {
            if (i < min) {
            min = i;
          }
            if else (i > max) {
            max = i;
        }
   }

        System.out.println("Smallest element in array " + min);
        System.out.println("Largest element in array " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
         }
        Array ob = new Array(a);
        ob.find();
    }
}
