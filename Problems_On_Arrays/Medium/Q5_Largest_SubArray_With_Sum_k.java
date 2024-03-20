

public class Q5_Largest_SubArray_With_Sum_k {
    public static void main(String[] args) {
        int k = 3;
        int arr[] = {1, 2, 3, 1, 1, 1, 1};
        System.out.println(longestSubarrayWithSumK(arr, k));
    }
    //optimal -- using two pointer approach
    public static int longestSubarrayWithSumK(int []a, long k) {
        int n = a.length-1;
        long sum = 0;
        int maxLen = 0;
        int right = 0;
        int left = 0;
        while(right<=n){
            sum+=a[right];
            while(left<=right && sum>k){
                sum-=a[left++];
            }
            if(sum==k){
                maxLen = Math.max(maxLen, right-left+1);
            }
            right++;
        }
        return maxLen;
    }
}
