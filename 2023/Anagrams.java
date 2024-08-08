import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Strng 1: ");
	String s1 = scan.next();
	System.out.println("Strng 2: ");
	String s2 = scan.next();
	
	System.out.println(anagrams(s1, s2));;
}

private static boolean anagrams(String string, String string2) {
	if (string.length() != string2.length()) return false;
	
	char[] c1 = string.toLowerCase().toCharArray();
	char[] c2 = string2.toLowerCase().toCharArray();
	
	boolean res = Arrays.equals(c1, c2);
	
	return res ? true : false;
	
}


}
