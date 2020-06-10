export function longestConsec(sa: string[], k: number): string {
    let lengths: number[] = sa.map(accum => accum.length);
    let start:number = -1;
    let value:number = 0;
    let longest:number = 0;
    
    for(let i=0; (i<sa.length); i++){
      value = 0;
      for(let j=0; j<k; j++){
        value += lengths[i+j];
      }
      if(value > longest){
        longest = value;
        start = i;
      }
    }
    
    let ans:string = "";
    if(start != -1){ 
      for(let x = 0; x < k; x++){
        ans += sa[start+x];
      }
    }
    
    return ans;
  }