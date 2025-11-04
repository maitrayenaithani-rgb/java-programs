import java.util.*;
class Composite {
    int arr[][];
    int M;
    int N;
    Composite(int mm, int nn) {
        M = mm;
        N = nn;
        arr = new int[M][N];
    }
        int isComposite(int p){
        if(p<4)
        return 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count > 2)
            return 1; 
        else
            return 0; 
    }
    void fill() {
        int num = 4; 
        for (int j = 0; j < N; j++) {
        for (int i = 0; i < M; i++) {
                while (isComposite(num) == 0)
                    num++;
                arr[i][j] = num;
                num++;
            }
        }
    }
    void display() {
        System.out.println("Matrix of Composite Numbers");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows ");
        int m = sc.nextInt();
        System.out.print("Enter columns  ");
        int n = sc.nextInt();
        Composite ob = new Composite(m, n);
        ob.fill();
        ob.display();
    }
}
