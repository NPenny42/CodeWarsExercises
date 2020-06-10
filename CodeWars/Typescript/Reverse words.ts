export function reverseWords(str: string): string {
    var splitStr = str.split(" ");
    var revStr : string = "";
    for(var i=0; i<splitStr.length; i++){
      revStr += splitStr[i].split("").reverse().join("");
      if(i != splitStr.length-1) revStr += " ";
    }
    return revStr;
  }