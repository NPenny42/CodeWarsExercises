public class FindOutlier{
    static int find(int[] integers){
    
    boolean even=false;
    if( integers[0]%2==0 && ( integers[0]%2==integers[1]%2 || integers[0]%2==integers[2]%2 ) 
        || ( integers[1]%2==0 && integers[1]%2==integers[2]%2 ) ){
      even=true;
    }  
    
    for(int x=0; x < integers.length; x++){
      if( (integers[x]%2==0 && even==false) 
        ||  ((integers[x]%2==1 || integers[x]%2==-1) && even==true)  ){
        return integers[x];}
    }
    return 0;
  }}