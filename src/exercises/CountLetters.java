package exercises;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    public static void main(String[] args){
        String text =   "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with." +
                        " So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that" +
                        " side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] textChars = text.toCharArray();

        HashMap<Character, Integer> lettersFrequency = new HashMap<>();

        for(char letter: textChars){
            if(!lettersFrequency.containsKey(letter)){
                lettersFrequency.put(letter, 1);
            } else {
                lettersFrequency.put(letter, lettersFrequency.get(letter) + 1);
            }
        }

        for (Map.Entry<Character, Integer> letterPair : lettersFrequency.entrySet()){
            System.out.println(letterPair.getKey() + ":" + letterPair.getValue());
        }

    }
}
