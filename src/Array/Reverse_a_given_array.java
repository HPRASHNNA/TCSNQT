package Array;

public class Reverse_a_given_array {
	static void printArray(int arr[]) {

		System.out.println("--Array--");
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

	}

	static void revprintArray(int arr[]) {

		System.out.println("\n--Reverse Array--");
		for (int i = arr.length-1; i >= 0; i--)
			System.out.print(arr[i] + " ");

	}

	public static void main(String[] args) {
		int[] a = new int[] { 6, 2, 8, 4, 5, 10, 9, 7, 1 };
		printArray(a);
		revprintArray(a);

	}

}
