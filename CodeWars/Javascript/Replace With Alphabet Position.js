function alphabetPosition(text) {
    let textNum = "";
    for(let i = 0; i < text.length; i++){
      let char = text.toUpperCase().charAt(i);
      if( (char.charCodeAt() >= 65) && (char.charCodeAt() <= 90) ){
        textNum += (char.charCodeAt() - 64) + " ";
      }
    }
    return textNum.trim();
  }
  