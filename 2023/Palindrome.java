import java.util.Scanner;

public class Palindrome {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter word: "); 
		String word = scan.next();
		
		System.out.println(palindrome(word));
	}

	private static boolean palindrome(String word) {
		String holder = word;
		String reverse = "";
		String[] tmp = word.split("");
		
		for (int i = tmp.length - 1; i >= 0; i--) {
			reverse += tmp[i];
		}
		
		return holder.equalsIgnoreCase(reverse) ? true : false;
	}


	
	
}
