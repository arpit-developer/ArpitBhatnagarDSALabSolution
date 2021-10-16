package DSAlab;

import java.util.Stack;
import java.util.Scanner;
public class BalancedBrackets {
    private static boolean isBalanced( String bracketExpression ) {
        Stack<Character> stack = new Stack();
        
        
        
        for( char c : bracketExpression.toCharArray() ) {
            
            if( c == '(' || c == '{' || c == '[' ) {
                // push to stack
                stack.push( c );
            } else { // else        
                // Aside: if stack is empty -> error
                if( stack.isEmpty() ) {
                    return false;
                }
            
                // pop from the stack (d)
                Character d = (Character) stack.pop();
                // check if c is the closing bracket for d
                if( c == '}' && d != '{' || ( c == ')' && d != '(' ) || ( c == ']' && d != '[' ) ) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
    public static void main( String[] args ) {
        
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Brackets");
        String bracketExpression = sc.nextLine();
        
        if( isBalanced( bracketExpression ) ) {
            System.out.println( "Balanced" );
        } else {
            System.out.println( "Not Balanced" );
        }
    }
}

