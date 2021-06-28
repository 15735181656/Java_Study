package example.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] temp = new int[]{2, 4, 17, 19, 9, 64, 121, 4, 21};
        System.out.println(Arrays.toString(temp));
        quickSort(temp, 0, temp.length - 1);
        System.out.println(Arrays.toString(temp));
    }
     public static void quickSort(int[] nums, int left, int right){
        if (left >= right)
            return;

        int part = partition(nums, left, right);

        quickSort(nums, left, part - 1);
        quickSort(nums, part + 1, right);
     }

     public static int partition(int[] nums, int left, int right){
        int temp = nums[left];

        while (left < right){
            while (left < right && nums[right] >= temp){
                right--;
            }
            nums[left] = nums[right];
            while (left < right && nums[left] <= temp){
                left++;
            }
            nums[right] = nums[left];
        }
        nums[right] = temp;
        return right;
     }
}
