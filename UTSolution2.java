import java.util.*;
class HeptaDigit 
{
    int num;
    String hep;

    HeptaDigit()
 {
        num = 0;
        hep = " ";
    }

    void getnum() 
{
        Scanner sc = new Scanner(System.in);       System.out.print("Enter a number");
        num = sc.nextInt();
    }
    String hep_convert(int n) {
        if (n == 0)
            return 0;
            else
           return hep_convert(n/7)+(n%7);
    }

    
    int countSpecial(String h) {
        if (h.length() == 0)
            return 0;

        int count = 0;

        if (h.charAt(0) == '3')
            return count++;
}
        return count + countSpecial(h.substring(1));
    }

    void isHepta() {
        hep = hep_convert(num);
        int c = countSpecial(hep); System.out.println("Base 7 of " + num + " = " + hep);
        System.out.println("Number of 3's = " + c);

        if (c%2==0) {
            System.out.println(num + " is Hepta");
        } else {
            System.out.println(num + " isn't Hepta");
        }
    

    public static void main(String args[]) {
        HeptaDigit ob = new HeptaDigit();
        ob.getnum();
        ob.isHepta();
    }
}
