import java.lang.Math;

public class Prime {
  public static boolean isPrime(int num) {
    if(num <= 1){return false;}
    for(int x=2; x <= ((int)Math.sqrt(num)); x++){
      if(num%x == 0){return false;}
    }
    return true;
  }
}