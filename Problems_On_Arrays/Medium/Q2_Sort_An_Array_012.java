 package Problems_On_Arrays.Medium;

import java.util.Arrays;

public class Q2_Sort_An_Array_012{
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Optimal
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, low, mid);
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums, mid, high);
                high--;
            }
        }
    }
    public static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    // BruteForce-----------------
    public void sortColorsBruteForce(int[] nums) {
        int n = nums.length;
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        for(int i=0; i<n; i++){
            if(nums[i]==0) countZero++;
            else if(nums[i]==1) countOne++;
            else countTwo++;
        }
        for(int i=0; i<countZero; i++){
            nums[i] = 0;
        }
        for(int i=countZero; i<(countZero+countOne); i++){
            nums[i] = 1;
        }
        for(int i=(countZero+countOne); i<(countZero+countOne+countTwo); i++){
            nums[i] = 2;
        }
    }
}