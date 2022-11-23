package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args){

//     #1 Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.
        int[] arr = {1, 1, 2, 3, 5, 8};

//     #2 Loop through the array and print out each value, then modify the loop to only print the odd numbers.
        for(int arrElement: arr){
            if(arrElement % 2 == 1) {
                System.out.println(arrElement);
            }
        }

/*      #3 For this exercise, use the string I would not, could not, in a box.
           I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.
           Use the split method to divide the string at each space and store the individual words in an array.
*/
        String text1 = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] wordsList = text1.split(" ");
        System.out.println(Arrays.toString(wordsList));
        String[] sentenceList = text1.split("\\.");
        System.out.println(Arrays.toString(sentenceList));

//      #4 Write a static method to find the sum of all the even numbers in an ArrayList.
//         Within main, create a list with at least 10 integers and call your method on the list.

        Integer[] numbersList = {2, 4, 5, 6, 6, 7, 8, 8, 8, 9, 11};
        int sumIntegers=0;
        for (int number: numbersList) {
           if(number%2 == 0){
               sumIntegers += number;
           }
        }
        System.out.println(sumIntegers);

    }
}
