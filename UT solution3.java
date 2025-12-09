import java.util.*;

class Pronic {
    int num;
    Pronic() {
        num = 0;
    }

    void acceptNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer");
        num = sc.nextInt();
    }
    boolean isPronic(int v) 
{
     if(v==0)
     return true;
        for (int i = 0; i * (i + 1) <= v; i++) {
            if (i * (i + 1) == v)
                return true;
        }
        return false;
    }

    void check() {
        if (isPronic(num)) {
            System.out.println(num + " is Pronic");
        } else {
            System.out.println(num + " isn't Pronic");
        }
    }

    public static void main(String args[]) {
        Pronic ob = new Pronic();
        ob.acceptNum();
        ob.check();
    }
