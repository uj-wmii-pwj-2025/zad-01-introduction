package uj.wmii.pwj.introduction;

public class Reverser {

    public String reverse(String input) {
        if(input == null){
            return null;
        }
        int start = 0;
        int end = input.length() - 1;

        while (start <= end && Character.isWhitespace(input.charAt(start))) {
            start++;
        }
        while (end >= start && Character.isWhitespace(input.charAt(end))) {
            end--;
        }

        if (start > end) {
            return "";
        }
        String result = "";
        for (int i = end; i >= start; i--) {
            result +=  input.charAt(i);
        }

        return result;
    }


    public String reverseWords(String input) {
        if(input == null){
            return null;
        }
        int start = 0;
        int end = input.length() - 1;
        while (start <= end && Character.isWhitespace(input.charAt(start))) {
            start++;
        }
        while (end >= start && Character.isWhitespace(input.charAt(end))) {
            end--;
        }

        if (start > end) {
            return "";
        }

        String[] words = input.split("\\s+");

        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result = result + words[i];
            if (i > 0) {
                result = result + " ";
            }
        }

        return result;

    }

}
