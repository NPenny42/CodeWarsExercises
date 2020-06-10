public class Kata {
    public static String createPhoneNumber(int[] numbers) {
      StringBuilder phoneString = new StringBuilder();
      phoneString.append("(");
      
      for(int x=0; x < numbers.length; x++){
        if(x == 3){phoneString.append(") " + Integer.toString(numbers[x]));}
        else if(x == 6){phoneString.append("-" + Integer.toString(numbers[x]));}
        else{phoneString.append(Integer.toString(numbers[x]));}  
      }
      return phoneString.toString();
    }
  }