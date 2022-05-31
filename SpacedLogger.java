package weekFiveCodingAssignment;
/*
 * SpacedLogger creates spaces in between letters in the word passed into the two methods.
 * @param log displays only the word with spaces in between the letters 
 * @param error displays the word ERROR: and the passed in word with spaces in between the letters.  
 */

import java.util.Date;

public class SpacedLogger implements Logger {
  public void log(String log) {
    Date date = new Date();
    System.out.println(date.toString());
  
    System.out.println(log.replace("", " ").trim());
    
  }

  
  public void error(String error) {
    Date date = new Date();
    System.out.println(date.toString());
    System.out.println("ERROR: " + error.replace("", " ").trim());
  }

}