package regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class RegularExpressions {
	
	//The Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings.
	//It is widely used to define the constraint on strings such as password and email validation. 
	//Java Regex API provides 1 interface and 3 classes in java.util.regex package. They are:
	
		//MatchResult interface
	
		//Matcher class
			//It implements the MatchResult interface. 
			//It is a regex engine which is used to perform match operations on a character sequence.
	
		//Pattern class
			//It is the compiled version of a regular expression.
			//It is used to define a pattern for the regex engine.
	
		//PatternSyntaxException class
	
	
	public static void main(String[] args) {
		
		//There are three ways to write the regex example in Java.
		
		//1
		
		Pattern p = Pattern.compile(".s"); //compiles the given regex and returns the instance of the Pattern.
		Matcher m = p.matcher("as"); //creates a matcher that matches the given input with the pattern.
		System.out.println(m.matches()); //True //test whether the regular expression matches the pattern.
		
		//2
		
		System.out.println(Pattern.compile(".s").matcher("as").matches());
		
		//3
		
		System.out.println(Pattern.matches(".s", "as"));
		
		//It works as the combination of compile and matcher methods.
		//It compiles the regular expression and matches the given input with the pattern.
		
		
		//The . (dot) represents a single character.
		
		//Example
		System.out.println();
		
		System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
		System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)  
		System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
		System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
		System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)  
		
		
		
		
//		Regex Character classes
		
		// [abc]		  - 	a, b, or c (simple class)
		// [^abc]		  -		Any character except a, b, or c (negation)
		// [a-zA-Z]		  -		a through z or A through Z, inclusive (range)
		// [a-d[m-p]]	  - 	a through d, or m through p: [a-dm-p] (union)
		// [a-z&&[def]]	  - 	d, e, or f (intersection)
		// [a-z&&[^bc]]   - 	a through z, except for b and c: [ad-z] (subtraction)
		// [a-z&&[^m-p]]  - 	a through z, and not m through p: [a-lq-z](subtraction)

		
//		Example
		System.out.println();
		
		System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)
		System.out.println(Pattern.matches("[amn]", "a")); //true (among a or m or n) 
		System.out.println(Pattern.matches("[amn]", "ammmna")); //false (m and a comes more than once) 
		System.out.println(Pattern.matches("[a-zA-Z]", "ab")); //false (It accepts only single character
		
		
		
		
//		Regex Quantifiers
		
		//The quantifiers specify the number of occurrences of a character.
		
		//X?	X occurs once or not at all
		//X+	X occurs once or more times
		//X*	X occurs zero or more times
		//X{n}	X occurs n times only
		//X{n,}	X occurs n or more times
		//X{y,z}	X occurs at least y times but less than z times
		
		System.out.println("\n\nRegex Quantifiers");
		
		System.out.println(Pattern.matches("[amn]?", "")); //true ("" or a or m or n comes one time)  
		System.out.println(Pattern.matches("[amn]?", "aa")); //false (a comes more than one time
		System.out.println(Pattern.matches("[amn]?", "am")); //flase (a or m or n must come one time)
		
		
		System.out.println();
		System.out.println(Pattern.matches("[amn]+", "a")); //true
		System.out.println(Pattern.matches("[amn]+", "aaa")); //true
		System.out.println(Pattern.matches("[amn]+", "ammmmnnna")); //true
		System.out.println(Pattern.matches("[amn]+", "azzza")); //false (z not in pattern)
		
		System.out.println();
		System.out.println(Pattern.matches("[amn]*", "")); //true
		System.out.println(Pattern.matches("[amn]*", "aaa")); //true
		System.out.println(Pattern.matches("[amn]*", "azzza")); //false (z not in pattern)
		
		
		
//		Regex Metacharacters
		
		//The regular expression metacharacters work as shortcodes.
		
		// .	Any character (may or may not match terminator)
		// \d	Any digits, short of [0-9]
		// \D	Any non-digit, short for [^0-9]
		// \s	Any whitespace character, short for [\t\n\x0B\f\r]
		// \S	Any non-whitespace character, short for [^\s]
		// \w	Any word character, short for [a-zA-Z_0-9]
		// \W	Any non-word character, short for [^\w]
		// \b	A word boundary
		// \B	A non word boundary
		
		
		System.out.println("\n\nRegex Metacharacters : ");
		
		
		System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)  
		System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
		System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)  
		System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)  
		
		System.out.println();
		System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)  
		System.out.println(Pattern.matches("\\D", "1"));//false (digit)  
		System.out.println(Pattern.matches("\\D", "4443"));//false (digit)  
		System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)  
		System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)  

		
		System.out.println();
		System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)  
		
		
		//Question 1
		
		//Create a regular expression that accepts alphanumeric characters only.  
		//Its length must be six characters long only.
		
		System.out.println(Pattern.matches("\\w{6}", "a123db")); //true
		System.out.println(Pattern.matches("\\w{6}", "a123d")); //false
		
		
		//Question 2
		
		//Create a regular expression that accepts 10 digit numeric characters 
		//starting with 7, 8 or 9 only.
		
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "7102342134"));
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "1102342134"));
		
		
		//Findex Example
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Enter regex Pattern : ");
			
			Pattern pattern = Pattern.compile(sc.nextLine());
			System.out.println("Enter text : ");
			
			Matcher matcher = pattern.matcher(sc.nextLine());
			
			boolean found = false;
			
			while(matcher.find()) {
				System.out.println("I found text '" + matcher.group() + "' Starting at Index " + matcher.start() + " and ending at index " + matcher.end());
				found = true;	
			}
			
			if(!found) {
				System.out.println("No match Found.");
			}
			
			
			
		}
		
		
		
		
	}

}
