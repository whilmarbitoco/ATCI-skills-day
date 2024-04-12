import java.util.Iterator;
import java.util.Scanner;

public class StarPattern {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter number of stars: ");
	int stars = scan.nextInt();
	printStar(stars);
}

private static void printStar(int stars) {
	for (int i = 0; i < stars; i++) {
		int counter = stars;
		
		for (int j = 0; j < i; j++) {
			System.out.print(" ");
		}
		
		for (int j = stars; j > i; j--) {
			System.out.print(j + " ");
		}
		System.out.println();
		
	}
}

}
