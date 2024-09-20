package org.launchcode;
import java.util.Scanner;

public class StringValidation {
    public static void main(String[] args){
        String source ="Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister" +
                " was reading, but it had no pictures or conversations in it, ‘and what is the use of" +
                " a book,’ thought Alice ‘without pictures or conversation?’";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to search: ");
        String name = input.nextLine().toLowerCase();
        System.out.println("name:"+name);
        if(source.toLowerCase().contains(name)){
            System.out.println("Yes! the word os present!");
        }else{
            System.out.println("SOrry! the word is not present!");
        }

        Integer index = source.indexOf(name);
        Integer length = name.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = source.replace(name, "");
        System.out.println(modifiedSentence);
    }
}
