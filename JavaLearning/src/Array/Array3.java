package Array;

public class Array3 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55, 66};
        int[] newarr = new int[arr.length];
        for(int i=arr.length-1, j = 0;i>=0;i--, j++){
            newarr[j] = arr[i];
            System.out.print(newarr[j] + " ");
            }
        }
    }

