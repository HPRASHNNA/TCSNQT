package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class plus_minus {


    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int size = arr.size();


    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(-4, 3, -9, 0, 4, 1);
        int size = arr.size();

        long positiveCount = arr.stream().filter(i -> i > 0).count();
        long negativeCount = arr.stream().filter(i -> i < 0).count();
        long zeroCount = arr.stream().filter(i -> i == 0).count();
        System.out.println(positiveCount + " " + negativeCount + " " + zeroCount);

        System.out.printf("%.6f %.6f %.6f", (float)positiveCount / size, (float)negativeCount / size, (float)zeroCount / size);
        for (Integer c : arr) {
            System.out.print(c + " ");
        }

    }


}

//decealtion of the list
/* List<datatype> 'list name ' = new ArrayList<> ();
Collections.addall(arr,  value )
 List<Integer> arr = List.of(-4, 3, -9, 0, 4, 1);

 */