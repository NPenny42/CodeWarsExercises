public class BitCounting {

    public static int countBits(int n){
      String binStr = Integer.toBinaryString(n);
      int count = 0;
      for(int x = 0; x < binStr.length(); x ++){
        if(binStr.charAt(x) == '1'){
          count ++;
        }
      }
      return count;
    }
  
  }