package uj.wmii.pwj.introduction;

public class Reverser {

    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input.trim()).reverse().toString();
    }

    public String reverseWords(String input) {
        if(input == null) return null;

        String t = input.trim();
        if(t.isEmpty()) return t;

        String[] words = t.split("\\s+");
        StringBuilder out = new StringBuilder(t.length());
        
        for(int i = words.length - 1; i >= 0; i--)
        {
            out.append(words[i]);
            if( i != 0) out.append(' ');
        }
        
        return out.toString();
    }   

}
