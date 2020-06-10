import java.lang.Math;

public class NumberFun {
  public static long findNextSquare(long sq) {
      long check = (long)Math.sqrt(sq);
      if( Math.pow(check, 2) != sq) {return -1;}
      else{return (long)Math.pow(check+1, 2);}
      // return 0; 
  }
}