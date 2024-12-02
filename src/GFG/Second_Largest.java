package GFG;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Second_Largest {


    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        System.out.println(seclag(arr));
        
    }


    static int seclag(int arr[])
    {
        Arrays.sort(arr);
        int n = arr.length;

        for(int i = n-2 ; i>=0;i++)
        {
            if(arr[i]!=arr[n-1])
            {
                return arr[i];
            }
        }
        return -1 ;
    }

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
}