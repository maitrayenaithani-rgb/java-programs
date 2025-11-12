import java.util.*;

class PalindromeWord {
    String str;
    int count;

    PalindromeWord() {
        str = "";
        count = 0;
    }

    void readstr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence ending with a full stop");
        str = sc.nextLine();
    }

    void countPalindrome() {
        str = str.trim();
        if (str.endsWith(".")) {
            str = str.substring(0, str.length() - 1);
        }

        String[] words = str.split(" ");
        count = 0;

        for (String word : words) {
            String rev = new StringBuilder(word).reverse().toString();
            if (word.equalsIgnoreCase(rev)) {
                count++;
            }
        }
    }

    void display() {
        System.out.println("Original Sentence: " + str + ".");
        System.out.println("Number of palindrome words: " + count);
    }

    public static void main(String[] args) {
        PalindromeWord obj = new PalindromeWord();
        obj.readstr();
        obj.countPalindrome();
        obj.display();
    }
}

