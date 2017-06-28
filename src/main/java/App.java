//add user interface logic
import java.io.Console;

public class App {
  public static void main(String[] args){
  Console myConsole = System.console();
  System.out.println("Enter a year, we will tell you if it's a leap year:");
  String stringYear = myConsole.readLine();
  int intYear = Integer.parseInt(stringYear);
  //create the instatnce of the LeapYear class, call our LeapYear method
  LeapYear leapYear = new LeapYear();
  boolean leapYearResult = leapYear.isLeapYear(intYear);
  System.out.println("Is that year is leap year?" + leapYearResult);
  }
}
