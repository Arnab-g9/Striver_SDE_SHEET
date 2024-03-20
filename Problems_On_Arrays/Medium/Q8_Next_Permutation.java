import java.util.ArrayList;
import java.util.List;

public class Q8_Next_Permutation {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        int n = arr.length;
        System.out.println(nextPermutation(n, arr));
    }
    //optimal solution
    //steps - 
    //1. first find out the smallest number from right and take the index
    //2. find out the smallest large number from the right and take the index and swap with the smallest no'sindex that u found.
    //3. then reverse the no from index+1 to n-1
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        int n = N;
        int index = -1;
        List<Integer> list = new ArrayList<>();
        for(int i=n-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                index = i;
                break;
            }
        }
        if(index==-1){
            for(int i=n-1; i>=0; i--){
                list.add(arr[i]);
            }
            return list;
        }else{
            for(int i=n-1; i>=index; i--){
                if(arr[i]>arr[index]){
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                    break;
                }
            }
            
            int i = index+1;
            int j=n-1;
            while(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; j--;
            }
        }
        for(int i=0; i<n; i++){
            list.add(arr[i]);
        }
        return list;
    }
}
