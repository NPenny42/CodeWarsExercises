export class G964 {
    public static playPass(s: string, n: number): string {
        return s.toUpperCase()
                  .split("")
                  .map( (c, i) => {
                      if( c.charCodeAt(0) > 47 && c.charCodeAt(0) < 58) return String.fromCharCode(57 - parseInt(c));
                      else if( c.charCodeAt(0) > 64 && c.charCodeAt(0) < 91){
                        let offset = (c.charCodeAt(0) + n) > 90 ? 26 : 0;
                        return i%2 != 0 ? String.fromCharCode(c.charCodeAt(0)+n+32-offset) : String.fromCharCode(c.charCodeAt(0)+n-offset);
                      }else return c;
                    })
                  .reverse()
                  .join("");
        
    }
}