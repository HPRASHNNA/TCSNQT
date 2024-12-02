package GFG;

public class Move_All_Zeroes_to_End {

    public static void main(String[] args) {
        int[] a = new int[] { 3,5,0,0,4 };
        // 0,2,4,3,5,0,0,0

        printArray(a);
        moved(a);
        System.out.println("\nLargest elemnet in array : " + a[a.length - 1]);
    }


    static void moved(int a[]) {
        int temp;
		System.out.println("\n--Sort Array--");
		for (int i = 0; i < a.length; i++) {
        for (int j = i + 1; j < a.length; j++) {
            if (a[i] == 0) {
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


}
