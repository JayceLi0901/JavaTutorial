package Array;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        char[] arr = new char[26];
        char letter = 'A';
        for(int i = 0; i < arr.length; i++){
            arr[i] = (char)letter++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
