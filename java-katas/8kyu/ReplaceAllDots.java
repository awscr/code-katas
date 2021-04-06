/* https://www.codewars.com/kata/596c6eb85b0f515834000049/train/java

The code provided is supposed replace all the dots '.' in the specified String str with 
dashes '-'

But it's not working properly.
*/

public class ReplaceAllDots {
  
  public static void main(String[] args) {
    System.out.println(replaceDots("Hello.World")); //"Hello-World"
    System.out.println(replaceDots("My.Name.Is.Oscar")); //"My-Name-Is-Oscar"
    System.out.println(replaceDots("Visual Studio Code.")); //"Visual Studio Code-"
  }

  public static String replaceDots(final String str) {
    return str.replace('.', '-');
  }
}
