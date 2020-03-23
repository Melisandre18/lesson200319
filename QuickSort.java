import java.util.Random;

public class QuickSort {
	static Random rand = new Random();

	static int split(int arr[], int low, int high) {
		int max = arr[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (arr[j] < max) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	static void sortArr(int arr[], int low, int high) {
		if (low < high) {
			int k =split(arr, low, high);
			sortArr(arr, low, k - 1);
			sortArr(arr,k + 1, high);
		}
	}

	public static void main(String args[]) {
		int arr[] = new int[1000000];
		for (int i = 0; i < arr.length; i++) {
		arr[i] = rand.nextInt(300);
		}
		long startTime = System.nanoTime();
		sortArr(arr, 0, arr.length - 1);
		long endTime = System.nanoTime();
		System.out.println("Runtime: " + (endTime - startTime));
	}

}
