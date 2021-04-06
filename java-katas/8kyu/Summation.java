/*
https://www.codewars.com/kata/55d24f55d7dd296eb9000030

Write a program that finds the summation of every number from 1 to num. The number will 
always be a positive integer greater than 0.
*/

public class Summation {

  public static void main(String[] args) {
    System.out.println(summation(4)); //10
    System.out.println(summation(8)); //36
    System.out.println(summation(20)); //210
  }

  public static int summation(int n) {
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum += i;
    }

    return sum;
  }
}