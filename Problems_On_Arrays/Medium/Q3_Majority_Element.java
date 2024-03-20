
import java.util.HashMap;
import java.util.Map;

public class Q3_Majority_Element {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2,5,5,5,5,5,5};
        System.out.println(majorityElement(arr));
    }
    //optimal approach - Moores algorithm
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int ele = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            if(count==0){
                ele = nums[i];
                count++;
            }else if(nums[i]==count) count++;
            else if(nums[i] != ele){
                count--;
            }
        }
        count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==ele) count++;
        }
        return count>n/2 ? ele : -1;
    }

    //better approach
    public static int majorityElementBetter(int []v) {
        //size of the given array:
        int n = v.length;

        //declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();

        //storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);
        }

        //searching for the majority element:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }

        return -1;
    }
}
