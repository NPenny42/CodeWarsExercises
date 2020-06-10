import java.util.*;

public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
      int count = 0;
      if(arr.isEmpty()){return 0;}
      
      for(String face : arr){
        if(face.length() == 3){
          if( (face.charAt(0) == ':' || face.charAt(0) == ';')
              && (face.charAt(1) == '-' || face.charAt(1) == '~')
              && (face.charAt(2) == ')' || face.charAt(2) == 'D') 
          ){count ++;}
        }else if(face.length() == 2){
          if( (face.charAt(0) == ':' || face.charAt(0) == ';') 
              && (face.charAt(1) == ')' || face.charAt(1) == 'D')
          ){count ++;}
        }
      }
      
      return count;
  }
}