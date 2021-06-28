package example.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] temp = new int[]{2, 4, 17, 19, 9, 64, 121, 4, 21};
        System.out.println(Arrays.toString(temp));
        insertSort(temp);
        System.out.println(Arrays.toString(temp));
    }
    public static void insertSort(int[] nums){
        for (int i = 1; i < nums.length; i++){
            int temp = nums[i];
            int j = i;
            while (j > 0 && nums[j - 1] >= temp){
                nums[j] = nums[j - 1];
                j--;
            }
            nums[j] = temp;
        }
    }
}
