export function evaporator(content: number, evapPerDay: number, threshold: number): number {
    let day : number = 0;
    let vol : number = content;
    while(vol > (content * threshold * .01)){
      day ++;
      vol = vol - (vol * evapPerDay * .01);
    }
    return day;
  }