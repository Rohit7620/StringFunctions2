package StringFunction2;
import java.util.*;
public class Stringfex
{
	public void stringfnct()
	{
		Scanner sc = new Scanner(System.in);
        // Taking user input
        System.out.print("Enter a string: ");
        
        String userString = sc.nextLine();

        // Applying various String methods
        //string
        System.out.println("Original String: " + userString);
        // length()
        
        System.out.println("Length of the string: " + userString.length());
        //upperCase()
        
        System.out.println("Uppercase: " + userString.toUpperCase());
        
        //lowerCase()
        System.out.println("Lowercase: " + userString.toLowerCase());
        
        //Sunbstring
        
        System.out.println("Substring (2-5): " + userString.substring(2, 5));
        
        //indexof()
        System.out.println("Index of 'e': " + userString.indexOf('e'));
        
        
       // System.out.println("Replacing 'a' with 'o': " + userString.replace('a', 'o'));
        
        System.out.println("Trim: " + userString.trim());
        
        System.out.println("Starts with 'H': " + userString.startsWith("H"));

	}

}
