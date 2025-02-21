package Stack.Easy.ValidParentheses20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static boolean isValid(String s){
        Stack<Character> myStack= new Stack<>();
        Map<Character, Character> myMap= new HashMap<>();
        myMap.put(')', '(');
        myMap.put('}', '{');
        myMap.put(']', '[');
        for(char c: s.toCharArray()){
            if(myMap.containsValue(c))
                myStack.push(c);
            else {
                if(myStack.isEmpty() || myMap.get(c) != myStack.pop())
                    return false;
            }
        }
        return myStack.isEmpty();
    }
    public static void main(String[] args) {
            String s="([[[]]]{";
        System.out.println(isValid(s));
    }
}
