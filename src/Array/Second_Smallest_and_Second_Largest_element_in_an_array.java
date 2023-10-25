package Array;

public class Second_Smallest_and_Second_Largest_element_in_an_array {

	static void sort(int a[]) {
		int temp;
		System.out.println("\n--Sort Array--");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(" " + a[i] + " ");
		}
	}

	static void printArray(int arr[]) {

		System.out.println("--Array--");
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

	}

	public static void main(String[] args) {
		int[] a = new int[] { 6, 2, 8, 4, 5, 10, 9, 7, 1 };
		printArray(a);
		sort(a);
		System.out.println("\n Second Smallest elemnet in array : " + a[1]);
		System.out.println("\n Second Largest  elemnet in array : " + a[a.length-2]);
	}

}
