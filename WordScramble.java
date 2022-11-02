//Andrew Rodriguez
//November 01, 2022
//COP3330 
//Assignment 5: Stacks


import java.util.Stack;

public class WordScramble {
	public static void main(String[] args) {

        //For testing 

	    // System.out.println(encode("1top2")); 
	    // System. out.println(encode("11top2e1cat22")); 
	    // System. out.println(encode("111tom2op2it2")); 
	    // System. out.println(encode("11top2i1tom22"));
	}
	
	// Encode Method
	public static String encode(String str) {
	    // initialise stack
	    Stack<Character> stack = new Stack<Character>();
	    
	    // add values to stack
	    for(int i=0; i<str.length(); i++) {
	        char ch = str.charAt(i);
	        if(stack.isEmpty()) {
	            stack.add(ch);
	        } else {
	            if((ch == '1' || ch == '2') && stack.peek() == ch) {
	                continue;
	            }
	            stack.add(ch);
	        }
	    }
	    
	
	    String mainCharacters = "";
	    String otherCharacters = "";
	    
	    /// while loop until empty
	    while(!stack.isEmpty()) {
	        // if top character of stack is 2, then do as follows
	        if(!stack.isEmpty() && stack.peek() == '2') {
	         
                char ch_2 = stack.pop();	            
                char ch3 = stack.pop();
	            char ch2 = stack.pop();
	            char ch1 = stack.pop();
	            char ch_1 = stack.pop();
	            

	            if(ch_1 != '1') {
	                stack.add(ch_1);
	                stack.add(ch1);
	                stack.add(ch2);
	                stack.add(ch3);
	            } 
	            

	            else {
	                mainCharacters = ch1 + "" + ch3 + "" + ch2 + mainCharacters;
	            }
	        } 
	        
	       
	        else {
	            String tmp = "";
	            while(!stack.isEmpty() && stack.peek() != '2') {
	                tmp += stack.pop();
	            }
	            otherCharacters = tmp + otherCharacters;
	        }
	    }
	    
	    
	    return mainCharacters + otherCharacters;
	}
	
}