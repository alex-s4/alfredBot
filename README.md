# alfredBot

Methods to be implemented:
	Guest Greeting
		Tip: Try using the String.format method for string interpolation in Java.
		Description:	Returns a greeting that includes the person's name.
		Inputs:	String name
		Return Type:	String
		Example Output:	"Hello, Beth Kane. Lovely to see you."


	Date Announcement
		Description:	Returns a polite announcement of the current date and time.
		Inputs:	None
		Return Type:	String
		Example Output:	"It is currently Wed Aug 11 16:34:59 PDT 2022."


	Respond Before Alexis
		Tip: Use the indexOf String method
		Description:	AlfredBot will periodically process audio (Alfred is listening.) Write a method that accepts any string of conversation and responds appropriately.
		Specifications	
			If "Alexis" appears in the conversation (in the string) return a snarky response, such as, "Right away, sir. She certainly isn't sophisticated enough for that."
			If "Alfred" is in the conversation return an obliging response, for example, "At your service. As you wish, naturally."
			If neither name is found, return an appropriate response, for instance, "Right. And with that I shall retire."
			Inputs:	String conversation
			Return Type:	String


Product Back Log (PBL) ~ Ninja Bonuses
	Guest Greeting (Ninja Bonus Version!)
		Description: Use method overloading to write another guestGreeting method that returns a greeting including the person's name as well as the day period. Note: It must have the same method name but will have a different method signature.
		Inputs: String name, String dayPeriod ("morning", "afternoon" or "evening")
		Return Type: String
		Example Output: "Good evening, Beth Kane. Lovely to see you."
		SENSEI VERSION: Instead of a string for the day period, write the overloaded method with no parameters, and use a Date object to determine the day period.
		Hint: Use your google-kung-fu! You can use the SimpleDateFormat class and the Format class to help. Both are part of the java.text library. To the bat-documentation!

Sensei Bonus
	Write your own AlfredQuote method using any of the String methods you have learned! For example, maybe he sometimes yells when he's angry.
