package src.main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CollectionExercises {
    public static void main(String[] args){
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for(int number: integerArray){
            if(number%2 !=0) {
                System.out.println(number);
            }
        }

        String mystring = "I would not, could not, in a box. I would not, could not " +
                "with a fox. I will not eat them in a house. I will not eat them with " +
                "a mouse.";
        String[] words = mystring.split(" ");
        System.out.println(Arrays.toString(words));

        String[] sentences = mystring.split("\\.");
        System.out.println(Arrays.toString(sentences));

        ArrayList<Integer> sampleNumbers = new ArrayList<>();
        sampleNumbers.add(12);
        sampleNumbers.add(51);
        sampleNumbers.add(23);
        sampleNumbers.add(24);
        sampleNumbers.add(44);
        sampleNumbers.add(21);
        System.out.println("The Sum of even numbers:"+CollectionExercises.sumEven(sampleNumbers));

        ArrayList<String> names = new ArrayList<>();
        names.add("Kayal");
        names.add("Neelesh");
        names.add("Zaara");
        names.add("Zaroon");
        names.add("Ayesha");
        names.add("Waseem");
        names.add("Neelaveni");
        names.add("Zeba");
        names.add("Sumaya");
        names.add("Thara");
        names.add("Sathish");
        CollectionExercises.printStringWithNoOfLetters(names);

        List<String> splitWords = new ArrayList<String>();
        String str[] = mystring.split(" ");
        splitWords = Arrays.asList(str);
        CollectionExercises.printStringWithNoOfLetters(splitWords);
    }

    public static int sumEven(ArrayList<Integer> numbers){
        int sum = 0;
        for(int number: numbers){
            if(number%2 == 0) {
                sum = sum + number;
            }
        }
        return sum;
    }

    public static void printStringWithNoOfLetters(List<String> names){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word length: ");
        int count = input.nextInt();

        System.out.println("The names with "+count+" letters are: ");
        for(String name: names){
            if(name.trim().length() == count){
                System.out.println(name);
            }
        }
    }


}
