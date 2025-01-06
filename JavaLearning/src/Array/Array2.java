package Array;

//数组在赋值的时候赋的是地址，而不是单纯的值。which means 如果我们先定义了array1, 然后执行array2 = array1，那么我们
// 在array2上做的改动也会反映在array1上。 如果想要两个array之间相互独立但是结构与数值一致，则需要先复array长度创建新的array，
// 然后通过遍历老数组中的每一个元素并将其赋值给新数组中相同下标的元素。

public class Array2 {
    public static void main(String[] args) {
        int[] arr = {4,-1,9,10,23};
        int max = arr[0];
        int cursor = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                cursor = i;
            }
        }
        System.out.println("max value is " + max + " and position is " + cursor);
    }
}
