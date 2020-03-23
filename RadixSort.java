import java.util.Arrays;
import java.util.Random;

public class RadixSort {
	static Random rand = new Random();

	static int findMax(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];
		return max;
	}

	static void countingSort(int arr[], int temp) {
		int end[] = new int[arr.length];
		int begin[] = new int[10];
		Arrays.fill(begin, 0);
		for (int i = 0; i < arr.length; i++)
			begin[(arr[i] / temp) % 10]++;
		for (int i = 1; i < 10; i++)
			begin[i] += begin[i - 1];
		for (int i = arr.length - 1; i >= 0; i--) {
			end[begin[(arr[i] / temp) % 10] - 1] = arr[i];
			begin[(arr[i] / temp) % 10]--;
		}
		for (int i = 0; i < arr.length; i++)
			arr[i] = end[i];
	}

	static void radixSort(int arr[]) {
		int max = findMax(arr);
		for (int i = 1; max / i > 0; i *= 10)
			countingSort(arr, i);
	}

	public static void main(String[] args) {
		int arr[] = new int[1000000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(300);
		}
		long startTime = System.nanoTime();
		radixSort(arr);
		long endTime = System.nanoTime();
		System.out.println("Runtime is: " + (endTime - startTime));
	}
}
