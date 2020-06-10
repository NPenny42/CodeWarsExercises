export function sumTriangularNumbers(n:number):number {
    var sum: number = 0;
    if(n>0){
      var count: number = 0;
      for(var i=0; i<n; i++){
        count += i + 1;
        sum += count;
      }
    }
    return sum;
  }