package example.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] temp = new int[]{2, 4, 17, 19, 9, 64, 121, 4, 21};
        System.out.println(Arrays.toString(temp));
        bubbleSort(temp);
        System.out.println(Arrays.toString(temp));
    }

    public static void bubbleSort(int[] temp){
        int len = temp.length;

        for (int i = 0; i < len; i++){
            for (int j = 0; j < len - 1 - i; j++){
                if (temp[j] > temp[j + 1]){
                    int a = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = a;
                }
            }
        }
    }
}
