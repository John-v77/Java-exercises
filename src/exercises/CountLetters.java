package exercises;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    public static void main(String[] args){
        String text =   "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with." +
                        " So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that" +
                        " side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] textCharsList = text.toCharArray();

        HashMap<Character, Integer> lettersFrequency = new HashMap<>();

        for(Character letter: textCharsList){
            if(!Character.isAlphabetic(letter)){ continue;}
            char lowerChar = Character.toLowerCase(letter);
            if(!lettersFrequency.containsKey(lowerChar)){
                lettersFrequency.put(lowerChar, 1);
            } else {
                lettersFrequency.put(lowerChar, lettersFrequency.get(lowerChar) + 1);
            }
        }

        for (Map.Entry<Character, Integer> letterPair : lettersFrequency.entrySet()){
            System.out.println(letterPair.getKey() + ":" + letterPair.getValue());
        }

    }
}
