/*
https://www.codewars.com/kata/5772da22b89313a4d50012f7

Create a function that gives a personalized greeting. This function takes two 
parameters: name and owner.
*/

public class PersonalizedMessage {

  public static void main(String[] args) {
    System.out.println(greet("Daniel", "Daniel")); //"Hello boss"
    System.out.println(greet("Oscar", "Daniel")); //"Hello guest"
    System.out.println(greet("Greg", "Greg")); //"Hello boss"
    System.out.println(greet("Michael", "Michael")); //"Hello boss"
  }

  public static String greet(String name, String owner) {
    return name == owner ? "Hello boss" : "Hello guest";
  }
}