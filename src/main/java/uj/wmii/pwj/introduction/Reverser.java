package uj.wmii.pwj.introduction;

public class Reverser {
    public String reverse(String input) {
        if (input == null) {
            return null;
        }

        String res = "";
        input = input.strip();

        for (int i = input.length() - 1; i >= 0; i--) {
            res += input.charAt(i);
        }

        return res;
    }

    public String reverseWords(String input) {
        if (input == null) { // not in the tests, but should be
            return null;
        }

        String res = "";
        input = input.strip();
        String[] words = input.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            res += words[i];
            if (i != 0) {
                res += " ";
            }
        }

        return res;
    }
}
