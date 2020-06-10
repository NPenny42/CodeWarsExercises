function openOrSenior(data){
    var memList = [];
    
    for(var i=0; i<data.length; i++){
      if( (data[i][0] >= 55) && (data[i][1] > 7) ) memList.push('Senior');
      else memList.push('Open');
    }
    
    return memList;
}