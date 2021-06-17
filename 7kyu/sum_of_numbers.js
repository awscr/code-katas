/* https://www.codewars.com/kata/55f2b110f61eb01779000053/

Given two integers a and b, which can be positive or negative, find the sum of all the 
integers between and including them and return it. If the two numbers are equal return a 
or b.

Note: a and b are not ordered!
Examples

GetSum(1, 0) == 1   // 1 + 0 = 1
GetSum(1, 2) == 3   // 1 + 2 = 3
GetSum(0, 1) == 1   // 0 + 1 = 1
GetSum(1, 1) == 1   // 1 Since both are same
GetSum(-1, 0) == -1 // -1 + 0 = -1
GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2 */

function getSum(a, b) {
  if (a === b) return a;

  let sum = 0;

  for (let i = Math.min(a, b); i <= Math.max(a, b); i++) {
    sum += i;
  }

  return sum;
}

// TESTS
console.log(getSum(1, 0)); //1
console.log(getSum(1, 2)); //3
console.log(getSum(-1, 2)); //2
