import java.util.Date;
import java.text.SimpleDateFormat;

public class AlfredQuotes {

    Date date = new Date();
    SimpleDateFormat dayPeriod = new SimpleDateFormat("H");
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello, %s. Lovely to see you. How are you?", name);
    }

    public String guestGreeting(String name, String dayPeriod) {
        // NINJA BONUS
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

    public String guestGreeting() {
        // SENSEI BONUS
        String hourOfDayStr = dayPeriod.format(new Date());
        int hourOfDayInt = Integer.parseInt(hourOfDayStr);

        String periodOfDay = "";

        if(hourOfDayInt >= 4 && hourOfDayInt <= 11){
            periodOfDay = "morning";
        } else if (hourOfDayInt >= 12 && hourOfDayInt <= 17){
            periodOfDay = "afternoon";
        } else if (hourOfDayInt >= 18){
            periodOfDay = "evening";
        } else if (hourOfDayInt <= 3){
            periodOfDay = "midnight";
        }
        
        return String.format("Good %s, lovely to see you", periodOfDay);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        return String.format("It is currently %s", date);
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") != -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.indexOf("Alfred") != -1){
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
        
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

