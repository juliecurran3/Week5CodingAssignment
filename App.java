package weekFiveCodingAssignment;

/*
 * App is where we can change the word to be passed into
 * the previously mentioned loggers. 
 */

public class App {

  public static void main(String[] args) {
    Logger asteriskLogger = new AsteriskLogger();
    
   asteriskLogger.log("Mello");
   asteriskLogger.error("Jello");
   
   Logger spacedLogger = new SpacedLogger();
   
   spacedLogger.log ("Eggs");
   spacedLogger.error("Bacon"); {
     
   } 
   }
}