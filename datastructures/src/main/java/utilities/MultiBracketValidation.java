package utilities;

import stacksandqueues.Stack;

import java.util.HashMap;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input){


        //https://www.w3schools.com/java/java_hashmap.asp
        //create a HashMap object to store the brackets
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('[', ']');
        brackets.put('{', '}');

        //initializing a stack
        Stack<Character> matchingBrackets = new Stack<>();

        int i;
        for(i = 0; i < input.length(); i++){
            char matching = input.charAt(i);
            if(brackets.containsKey(matching)){
                matchingBrackets.push(brackets.get(matching));
            } else if(brackets.containsValue(matching)){
                if(matchingBrackets.isEmpty() || matchingBrackets.pop() != matching){
                    return false;
                }
            }
        }

        return matchingBrackets.isEmpty();
    }
}
