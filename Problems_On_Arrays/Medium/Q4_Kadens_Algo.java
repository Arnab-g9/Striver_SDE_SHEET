package Problems_On_Arrays.Medium;

public class Q4_Kadens_Algo {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    //optimal solution
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        if(nums.length==1) return nums[0];
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            maxSum = Math.max(sum, maxSum);
            if(sum<0) sum=0;
        }
        return maxSum;
    }
}
