package src.main.java;

import java.util.HashMap;
import java.util.Map;

public class characterCount {
    public static void main(String[] args){
        String mystring = "If the product of two terms is zero then common sense says" +
                " at least one of the two terms has to be zero to start with. So if " +
                "you move all the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of the equation " +
                "to equal zero. Once you’ve done that, it’s pretty straightforward " +
                "from there.";
        String alphaOnly = mystring.replaceAll("[^a-zA-Z]+","");
        char[] charactersInString = alphaOnly.toLowerCase().toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char characterCompare : charactersInString) {
            if (charCount.containsKey(characterCompare)) {
                int value = charCount.get(characterCompare) + 1;
                charCount.put(characterCompare, value);
            } else {
                charCount.put(characterCompare, 1);
            }
        }
        for(Map.Entry<Character, Integer> characters: charCount.entrySet()) {
            System.out.println(characters.getKey() + "("+characters.getValue()+")");
        }
    }
}
