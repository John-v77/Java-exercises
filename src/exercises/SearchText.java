package exercises;
import java.util.Scanner;
public class SearchText {
    public static void main(String[] args){
        String text = "Alice was beginning to get very tired of sitting";
        Scanner input = new Scanner(System.in);

        System.out.println("What is the word searched? :");
        String wordSearched = input.next();

        boolean answer = text.contains(wordSearched);
        System.out.println(answer);

        Integer indexFound = text.indexOf(wordSearched);
        Integer lengthWord = wordSearched.length();
        System.out.println("Searched word appears at index: " + indexFound +" and is " +  lengthWord + "character long");
        String modifiedText = text.replace(wordSearched, "");
        System.out.println(modifiedText);

    }
}
