package example.sort;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {
        int[] temp = new int[]{2, 4, 17, 19, 9, 64, 121, 4, 21};
        System.out.println(Arrays.toString(temp));
        selectSort(temp);
        System.out.println(Arrays.toString(temp));
    }

    public static void selectSort(int[] nums){
        int len = nums.length;
        for (int i = 0; i < len; i++){
            int min = i;
            for (int j = i; j < len; j++){
                if (nums[min] > nums[j]){
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }
}
