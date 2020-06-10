var uniqueInOrder=function(iterable){
    //your code here - remember iterable can be a string or an array
    var temp = [];
    var uniq = [];
    Array.isArray(iterable) ? temp = iterable : temp = iterable.split('');
    if (temp.length == 0) return temp;
    uniq[0] = temp[0];
    for (i = 1; i < temp.length; i++) {
      if (temp[i] != temp[i-1]) uniq.push(temp[i]);
    }
   
    return uniq;
  }