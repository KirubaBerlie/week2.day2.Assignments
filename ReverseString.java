package week2.day2.Assignments;
//Here is the input
//		String test = "feeling good";



import java.lang.reflect.Array;

// Build the logic to find the count of each
		/* Pseudo Code: 1
			a) Convert the String to character array
			b) Traverse through each character (using loop in reverse direction)
			c) Print the character (without newline -> like below
			   System.out.print(ch);
		*/

/* Pseudo Code: 2
		a) Find the length of the string
		b) Traverse through each index from length-1 -> 0 (using loop in reverse direction)
		c) Find the character of the String using its index
		*/
public class ReverseString {

	public static void main(String[] args) {
		String test1 = "feeling good";
		char[] charArray1 = test1.toCharArray();
		System.out.println("Using Array:");
		for(int i=Array.getLength(charArray1)-1; i>=0;i--)
			System.out.print(charArray1[i]);
		
		System.out.println("");
		System.out.println("Using String:");
		String test2 = "feeling good";
		int strlength = test2.length();
			
		for(int i=strlength-1;i>=0;i-- )
			System.out.print(test2.charAt(i));	
		
		
		
	}

}
