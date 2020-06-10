export class G964 {
    public static inArray(a1: string[], a2: string[]): string[] {
      var roots: string[] = a1.filter(r => r);
      var words: string[] = a2.filter(w => w);
      var cont : string[] = [];
      
      for (let word of words){
        for(let root of roots){
          let re = new RegExp( root );
          
          if( word.match(re) &&
              (cont.indexOf(root) == -1)){
            cont.push(root);
            roots.splice(roots.indexOf(root), 1);
          }
          
        }
      }
  
      return cont.sort();
    }
  }