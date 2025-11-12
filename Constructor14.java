import java.util.*;
class VowelWord {
    String str;
    int freq;

    VowelWord() {
        str = "";
        freq = 0;
    }

    void readstr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence ending with a full stop");
        str = sc.nextLine();
    }

    void freq_vowel() {
        str = str.trim();
        if (str.endsWith(".")) {
            str = str.substring(0, str.length() - 1);
        }

        String[] words = str.split(" ");
        freq = 0;

        for (String word : words) {
            if (word.length() > 0) {
                char ch = Character.toLowerCase(word.charAt(0));
                if ("aeiou".indexOf(ch) != -1) {
                    freq++;
                }
            }
        }
    }

    void display() {
        System.out.println("Original Sentence: " + str + ".");
        System.out.println("Words beginning with a vowel " + freq);
    }

    public static void main(String[] args) {
        VowelWord obj = new VowelWord();
        obj.readstr();
        obj.freq_vowel();
        obj.display();
    }
}
