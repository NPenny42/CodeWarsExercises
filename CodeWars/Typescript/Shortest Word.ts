export function findShort(s: string): number {
  
    function compareNumbers(a,b) {
      return a-b;
    }
    
    return parseInt(s.split(" ")
            .map( l => l.length)
            .sort(compareNumbers)
            .shift()
            .toString()
            );
  }