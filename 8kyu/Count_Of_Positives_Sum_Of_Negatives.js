/*
https://www.codewars.com/kata/576bb71bbbcf0951d5000044

Given an array of integers.

Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.

If the input array is empty or null, return an empty array.

Example
For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
*/

function countPositivesSumNegatives(input) {
  const negatives = input.filter((num) => num < 0);
  const negativesSum = negatives.reduce((a, b) => a + b, 0);

  return [input.length - negatives.length, negativesSum];
}
