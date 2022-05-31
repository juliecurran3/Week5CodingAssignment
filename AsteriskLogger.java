package weekFiveCodingAssignment;
/*
 * AsteriskLogger displays the date and the passed word in a 
 * box of asterisks or the ERROR:and the word in a box of asterisks.
 * @param log the word is surrounded by asterisks
 * @param error the word preceded by ERROR: and surrounded by asterisks.  
 */
import java.util.Date;

public class AsteriskLogger implements Logger{
  public void log(String log) {
    Date date = new Date();
    System.out.println(date.toString());
   
  int n = log.length();
  
  for(int i = 0; i < n+ 6; i++) {
    System.out.print("*");
    }
    System.out.println();    

    System.out.println("***" + log + "***");
  
  for(int i = 0; i < n + 6; i++) {
    System.out.print("*");  
  }
    System.out.println(); 
  }  
  /*
   * Continuation of AsteriskLogger.java
   */
  public void error(String error) {
    Date date = new Date();   
    System.out.println(date.toString());
    
    int n = error.length();
    
    for(int i = 0; i < n+ 13; i++) {
      System.out.print("*");
   }
      System.out.println();    

      System.out.println("***ERROR: " + error + "***");
    
    for(int i = 0; i < n + 13; i++) {
      System.out.print("*");
     
    }
      System.out.println();  
  }
}
