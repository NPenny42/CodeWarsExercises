export function vertMirror(str: string) {
    return str
      .split('\n')
      .map(str =>
        str
          .split('')
          .reverse()
          .join('')
      )
      .join('\n')
  }
  
  export function horMirror(str: string) {
    return str
      .split('\n')
      .reverse()
      .join('\n')
  }
  
  export function oper(fct: (s: string) => string, s: string) {
    return fct(s);
  }