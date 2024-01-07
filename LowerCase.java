/** String processing exercise 1. */
public class lowercase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String answerString = "";
		for (int i = 0; i < s.length(); i++)
		{
			//if its a uppercase letter between A to Z: convert it to lowercase letter
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
				answerString += (char)(s.charAt(i) + 'a' - 'A');
			}
			else{
				answerString += s.charAt(i);
			}
		}
        return answerString;
    }
}
