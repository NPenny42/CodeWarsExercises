import java.lang.StringBuilder;

class Solution {
    public static String whoLikesIt(String... names) {
        StringBuilder peeps = new StringBuilder();
        
        if(names == null || names.length == 0) return "no one likes this";
        else if(names.length == 1) 
          return String.format("%s likes this", names[0]);
        else if(names.length == 2) 
          return String.format("%1$s and %2$s like this", names[0], names[1]);
        else if(names.length == 3) 
          return String.format("%1$s, %2$s and %3$s like this", names[0], names[1], names[2]);
        else if(names.length > 3) 
          return String.format("%1$s, %2$s and %3$d others like this", names[0], names[1], (names.length-2));
        return "";
    }
}