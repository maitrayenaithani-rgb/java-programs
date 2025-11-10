import java.util.*;
class Combine {
    int com[];
    int size;

    Combine(int nn) {
        size = nn;
        com = new int[size];
    }

    
    void inputArray() {
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter " + size + " elements of the array");
       for (int i = 0; i < size; i++) {
       com[i] = sc.nextInt();
        }
    }

    
    void sort() {
        for (int i = 0; i < size - 1; i++) {
            int ind = i;
            for (int j = i + 1; j < size; j++) {
                if (com[j] < com[ind]) {
                    ind = j;
                }
            }
            int temp = com[i];
            com[i] = com[ind];
            com[ind] = temp;
        }
    }


    void mix(Combine A, Combine B) {
        for (int i = 0; i < A.size; i++) {
            com[i] = A.com[i];
        }
        for (int i = 0; i < B.size; i++) {
            com[A.size + i] = B.com[i];
        }
    }

    
    void display() {
        System.out.println("Elements of the array");
        for (int i = 0; i < size; i++) {
            System.out.print(com[i] + " ");
        }
      
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array");
        int n1 = sc.nextInt();
        Combine ob=new Combine();
        Combine A = new Combine(n1);
        A.inputArray();
        System.out.print("Enter size of second array ");
        int n2 = sc.nextInt();
        Combine B = new Combine(n2);
        B.inputArray();

        Combine C = new Combine(0);
        C.mix(A, B);

        System.out.println("Combined array");
        C.display();

        C.sort();
      }
}
