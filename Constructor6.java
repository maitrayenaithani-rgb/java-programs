import java.util.*;
class Arm {

    int no;
    int sum;
    Arm(int n) {
        no = n;
        sum = 0;
    }

    long fnPower(int a, int b) {
        if(b==0)
        return 1;
        else
        return a*fnPower(a,b-1);
        }

    
    void fnPerform() {
        int r = no;
        while(r>0){
        int d=r%10;
        sum=sum+fnPower(d,3);
        r=r/10;
        }

        if (sum == no)
            System.out.println(no + " is an Armstrong number");
        else
            System.out.println(no + " is not an Armstrong number");
    }

    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        Arm ob = new Arm(n);
        ob.fnPerform(); 
    }
}
