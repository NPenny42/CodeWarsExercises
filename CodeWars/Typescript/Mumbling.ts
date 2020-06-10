export function accum(s: string): string {
    var str:string = "";
    for(var i:number = 0; i<s.length; i++){
      str += s.charAt(i).toUpperCase();
      for(var x:number =0; x<i; x++){
        str += s.charAt(i).toLowerCase();
      }
      if(i != s.length-1) str += "-";
    }
    return str;
  }