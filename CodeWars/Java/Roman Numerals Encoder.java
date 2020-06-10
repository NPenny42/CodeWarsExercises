import java.lang.StringBuilder;

public class Conversion {

    public String solution(int n) {
        int result = n;
        StringBuilder roman = new StringBuilder(); 
        
        for(int t=1; t <= result/1000; t++){roman.append("M");}
        result = result%1000;
        
        if(result/100 == 9){
          roman.append("CM");
        }else if(result/100 >= 5){
          roman.append("D");
          for(int h = 6; h <= result/100; h ++){roman.append("C");}
        }else if(result/100 == 4){roman.append("CD");
        }else if(result/100 < 4){
          for(int h = 1; h <= result/100; h ++){roman.append("C");}
        }
        result = result%100;
        
        if(result/10 == 9){
          roman.append("XC");
        }else if(result/10 >= 5){
          roman.append("L");
          for(int t = 6; t <= result/10; t ++){roman.append("X");}
        }else if(result/10 == 4){roman.append("XL");
        }else if (result/10 < 4){
          for(int t = 1; t <= result/10; t ++){roman.append("X");}
        }
        result = result%10;

        if(result == 9){
          roman.append("IX");
        }else if(result >= 5){
          roman.append("V");
          for(int o = 6; o <= result; o ++){roman.append("I");}
        }else if(result == 4){roman.append("IV");
        }else{
          for(int o = 1; o <= result; o ++){roman.append("I");}
        }
        
        return roman.toString();
    }
}