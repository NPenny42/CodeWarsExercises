var isSquare = function(n){
    if (n>=0){
      x = parseInt(Math.sqrt(n));
      x * x == n ? ans = true : ans = false;
      return ans;
    }
    else return false;
  }