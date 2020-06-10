import java.util.Stack;

public class BraceChecker {

  public boolean isValid(String braces) {
    Stack<Character> parens  = new Stack<Character>();
    
    for(int c = 0; c < braces.length(); c ++){
      if(braces.charAt(c) == '(' || braces.charAt(c) == '{' || braces.charAt(c) == '['){parens.push(braces.charAt(c));}
      else if( (braces.charAt(c) == ')' || braces.charAt(c) == '}' || braces.charAt(c) == ']') 
                && !parens.empty() ){
        if( (parens.peek() == '(' && braces.charAt(c) == ')')
            || (parens.peek() == '{' && braces.charAt(c) == '}') 
            || (parens.peek() == '[' && braces.charAt(c) == ']') ){
          parens.pop();
        }else return false;
        
      }else return false;
    }
    
    boolean ans = parens.empty() ? true : false;
    return ans;
  }

}