export function solution(str: string, ending: string): boolean {
    return str.substring(str.length-ending.length) == ending;
    // return false; // TODO: complete
  }