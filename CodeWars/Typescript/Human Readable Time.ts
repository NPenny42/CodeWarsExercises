export function humanReadable(seconds:number):string {
    var park:number = seconds;
    var hours:string = Math.floor(park/3600).toString();
    hours.length < 2 ? hours = "0" + hours : hours;
    park = park%3600;
    var minutes:string = Math.floor(park/60).toString();
    minutes.length < 2 ? minutes = "0" + minutes : minutes;
    park = park%60;
    var secs = park.toString();
    secs.length < 2 ? secs = "0" + secs : secs;
    return hours + ":" + minutes + ":" + secs;
  }