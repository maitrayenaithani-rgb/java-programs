import java.util.*;
class Snowball {
String s;
Snowball()
{
s=" ";
    }
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        s = sc.nextLine();
        s = s.toLowerCase();
    }

     
    boolean isSnow() {
        char last = s.charAt(s.length() - 1);
        if (last != '.') {
            return false;
        }
        String str = s.substring(0, s.length() - 1);
        String words[] = str.split(" ");

        
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() != words[i - 1].length() + 1) {
                return false;
            }
        }

        return true;
    }

    
    void check() {
        char l = s.charAt(s.length() - 1);
        if (l != '.') {
            System.out.println("Incorrect sentence, end with '.'");
            return;
        }

        if (isSnow()) {
            System.out.println("IT IS A SNOWBALL STRING");
        } else {
            System.out.println("IT IS NOT A SNOWBALL STRING");
        }
    }
}
