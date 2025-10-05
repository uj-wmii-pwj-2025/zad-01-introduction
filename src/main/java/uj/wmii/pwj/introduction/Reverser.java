package uj.wmii.pwj.introduction;

public class Reverser {

    public String reverse(String input) {
        if (input == null) return null;

        input.strip();
        int length = input.length();
        String result = "";

        for (int i = length - 1; i >= 0; i--) {
            result += input.charAt(i);
        }

        return result;
    }

    public String reverseWords(String input) {
        if (input == null) return null;

        String[] words = input.split(" ");
        System.out.println(words.length);
        int numOfWords = words.length;
        StringBuilder result = new StringBuilder();

        for (int i = numOfWords - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }

}
