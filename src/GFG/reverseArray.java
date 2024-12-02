package GFG;

public class reverseArray {
    static void printArray(int arr[]) {
        System.out.println("--Array--");
        int n = arr.length;
        for (int j : arr)
            System.out.print(j + " ");

    }

    static void revprintArray(int arr[]) {
        System.out.println("\n--Reverse Array--");
        int n = arr.length;

        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        int[] a = new int[] { 6, 2, 8, 4, 5, 10, 9, 7, 1 };
        printArray(a);
        revprintArray(a);


    }

}
