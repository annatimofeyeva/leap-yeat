import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest{

  @Test
  public void isLeapYear_forNumbersDivisibleByFour_true(){
    LeapYear leapYear = new LeapYear();
    assertEquals(true, leapYear.isLeapYear(2012));
  }

  @Test
  public void isLeapYear_forNumbersNotDivisibleByFour_false(){
    LeapYear leapYear = new LeapYear();
    assertEquals(false, leapYear.isLeapYear(1999));
  }

    @Test
    public void isLeapYear_forNumberMultiplesOfOneHundred_false(){
      LeapYear leapYear = new LeapYear();
      assertEquals(false, leapYear.isLeapYear(1999));
    }

    @Test
    public void isLeapYear_forNumberMultiplesOfOneHundred_true(){
      LeapYear leapYear = new LeapYear();
      assertEquals(true, leapYear.isLeapYear(2000));
    }
}
