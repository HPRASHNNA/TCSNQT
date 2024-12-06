package GFG;

public class stock {

    /*    public static void findSmallestAndNextLarger(int[] arr) {
            int minNumber = arr[0];
            int minIndex = 0;

            // Find index of the smallest number
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < minNumber) {
                    minNumber = arr[i];
                    minIndex = i;
                }
            }

            System.out.println("The index of the smallest number in the array is: " + minIndex +","+ arr[minIndex]);

            // Find the index of the first larger number to the right of the smallest number
            int nextLargerIndex = -1;
            int a = minNumber;
            for (int j = minIndex ; j < arr.length; j++) {
                if (arr[j] > a) {
                    a=arr[j];
                    nextLargerIndex = j;

                }
            }

            if (nextLargerIndex != -1) {
                System.out.println("The index of the first larger number to the right of the smallest number is: " + nextLargerIndex +","+ arr[nextLargerIndex]);
            } else {
                System.out.println("There is no larger number to the right of the smallest number.");
            }
        }*/


    public static void findSmallestAndNextLarger(int[] arr) {
        int diff = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tempDiff = (arr[j] - arr[i]);
                    if (tempDiff > diff) {
                        diff = tempDiff;
                    }
                }
            }
        }
        System.out.println(diff);
    }

        public static void main(String[] args) {
            int[] arr = {7, 10, 1, 3, 6, 9, 2};
            findSmallestAndNextLarger(arr);
        }
    }

