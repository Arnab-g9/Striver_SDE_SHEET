

import java.util.Arrays;
import java.util.HashMap;

public class Q1_Two_Sum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }
    
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i]) && i != map.get(target-nums[i])){
                return new int[]{i, map.get(target-nums[i])};
            }
        }
        return new int []{-1, -1};
    }
}
