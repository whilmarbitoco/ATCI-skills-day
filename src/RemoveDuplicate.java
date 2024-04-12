import java.util.Iterator;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] arr = {3,6,26,65,22,25,56,13,67,21,67,3,5,6,26};
		
		printArr(arr);
		removeDuplicate(arr);
		
		printArr(arr);
	}

	private static int[] removeDuplicate(int[] arr) {
		int unique[] = new int[arr.length];
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				unique[i] = arr[i];
			}
		}
		
		return unique;
		
		
	}
	
	public static void printArr(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
	System.out.println();
	}
}
