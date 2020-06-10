import java.util.TreeMap;

public class Line {
   public static String WhoIsNext(String[] names, int n)
     {
        int row = n;
        
        while(row > names.length){
          row = (row - 4) / 2;
        }
        
        return names[row-1];
      }
}