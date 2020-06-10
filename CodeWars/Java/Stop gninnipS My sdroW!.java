import java.lang.StringBuilder;

public class SpinWords {

  public String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    StringBuilder spinSent = new StringBuilder();
    for(int i = 0; i < words.length; i++){
      StringBuilder sWord = new StringBuilder(words[i]);
      if(words[i].length() >= 5){spinSent.append(sWord.reverse());}
      else{spinSent.append(sWord);}
      if(i+1 < words.length){spinSent.append(" ");}
    }
    return spinSent.toString();
  }
}