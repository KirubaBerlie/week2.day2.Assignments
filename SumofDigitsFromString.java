package week2.day2.Assignments;

/*
 * Method 1
 * Pseudo Code
 
 * Declare a String text with the following value
	String text = "Tes12Le79af65";
   Declare a int variable sum
	int sum = 0;
 * a) using replaceAll(), replace all the non-digits into ""
 * b) Now, convert the String into array
 * c) Iterate over the array and get each character
 * d) Using Character.getNumericValue(), Change the char into int
 * e) Add the values to sum & print
 * 
 */
/*
 * Method 2
 * Pseudo Code
 * Declare a String text with the following value
	String text = "Tes12Le79af65";
   Declare a int variable sum
	int sum = 0;
 * a) Iterate an  array over the String
 * b) Get each character and check if it is a number using Character.isDigit()
 * c) Now covert char to int using Character.getNumericValue() and add it to sum
 * d) Now Print the value
 */

public class SumofDigitsFromString {

	public static void main(String[] args) {
	
		String text = "Tes12Le79af65";
		int sum = 0;
		String textInt = text.replaceAll("\\D", "");
		char[] charArr1 = textInt.toCharArray();
		
		for(int i=0;i<=charArr1.length-1;i++)
		{
		char c = charArr1[i];
		sum =sum + Character.getNumericValue(c);			
		}
		
		System.out.println("sum of "+ textInt +" :" + sum);
		
		String text1 = "Tes12Le79af65";
		int sum1 = 0;
		for(int i=text1.length()-1;i>=0;i--)
		{
			char c1 = text1.charAt(i);
			if (Character.isDigit(c1))
			  sum1 =sum1 + Character.getNumericValue(c1);
			 
		}
		
		System.out.println("sum using isDigit :" + sum1);
	}

}
