import java.util.*;
class UpperCase {
    String str;
    int count;

    UpperCaseWord() {
        str = "";
        count = 0;
    }

    void readSentence() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence ending with a full stop");
        str = sc.nextLine();
    }

    void countUpper() {
        str = str + " ";
        String word = "";
        count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && ch != '.') {
                word = word + ch;
            } else {
                if (word.length() > 0) {
                    boolean allUpper = true;
                    for (int j = 0; j < word.length(); j++) {
                        char c = word.charAt(j);
                        if (c < 'A' || c > 'Z') {
                            allUpper = false;
                            break;
                        }
                    }
                    if (allUpper)
                        count++;
                }
                word = "";
            }
        }
    }

    void display() {
        System.out.println("Sentence " + str);
        System.out.println("Uppercase words" + count);
    }

    public static void main(String args[]) {
        UpperCase ob = new UpperCase();
        ob.readSentence();
        ob.countUpper();
        ob.display();
    }
