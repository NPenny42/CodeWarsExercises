function XO(str) {
    var xs = str.match(/(x|X)/g) ? str.match(/(x|X)/g).length : 0;
    var os = str.match(/(o|O)/g) ? str.match(/(o|O)/g).length : 0;
    return xs == os;
}