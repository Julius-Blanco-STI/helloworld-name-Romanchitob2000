
package javaapplication2;
import java.util.Scanner;
public class JavaApplication2 {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
System.out.println("Hellow World\n");

System.out.print("Whats your name? ");
String name = scn.nextLine();
System.out.println("");


System.out.print("How old are you? ");
String age = scn.nextLine();
System.out.println("");


System.out.print("What's your address? ");
String add = scn.nextLine();
System.out.println("");


System.out.println("Hi " +name);
System.out.println("Your age is " +age);
System.out.println("you are live in " +add);
    }
    
}
