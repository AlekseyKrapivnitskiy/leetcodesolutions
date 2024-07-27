package easy;

import java.util.Arrays;
import java.util.Stack;

public class ValidParentless {

    public static void main(String[] args) {
        System.out.println("result = " + isValid("({{{{}}}))"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(')');
            }else if(s.charAt(i) == '{'){
                stack.push('}');
            }else if(s.charAt(i) == '['){
                stack.push(']');
            }else if(stack.isEmpty() || stack.pop() != s.charAt(i)){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
