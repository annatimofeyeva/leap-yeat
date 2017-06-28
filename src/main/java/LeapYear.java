//backend logic
public class LeapYear{

  public boolean isLeapYear(int year){
    if( year % 100 == 0 ) {
      return true;
    } else return year % 4 == 0;
  }
}
