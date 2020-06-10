import java.lang.StringBuilder;
import java.lang.String;

public class PigLatin {
    public static String pigIt(String str) {
        String[] strArr = str.split(" ");
        StringBuilder sent = new StringBuilder();
        for (int i=0;i<strArr.length;i++) {
          if(strArr[i].contains("!") || strArr[i].contains("?")){
            sent.append(strArr[i]);
          }
          else {
            sent.append(strArr[i].substring(1)+strArr[i].charAt(0)+"ay");
            if(i<strArr.length-1) sent.append(" ");
          }
          
        }
        return sent.toString();
    }
}