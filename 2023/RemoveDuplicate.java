import java.util.Iterator;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] arr = {3,6,26,65,22,25,56,13,67,21,67,3,5,6,26};
		
//		sort(arr);
		int[] tmp = sort(arr);
		
		int[] tmp2 = removeDuplicate(tmp);
		printArr(tmp2);
	}

	private static int[] removeDuplicate(int[] arr) {
		int unique[] = new int[arr.length];
		
		for (int i = 0; i < arr.length - 1; i++) {
			int current = arr[i];
			
			for (int j = 0; j < arr.length - i - 1; j++) {
				
				if (arr[j] != arr[j + 1]) {
					unique[j] = arr[j];
				
				}
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
	
	public static int[] sort(int[] arr) {
		
		int tmp;
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		return arr;
	}
}
