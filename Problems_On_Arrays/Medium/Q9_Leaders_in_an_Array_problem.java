import java.util.ArrayList;
import java.util.List;

class Leaders_in_Array{
    public static List< Integer > superiorElements(int []a) {
        // Write your code here.
        List<Integer> list = new ArrayList();
        int maxFromRight = Integer.MIN_VALUE;
        for(int i=a.length-1; i>=0; i--){
            if(a[i]>maxFromRight) {
                list.add(a[i]);
                maxFromRight = a[i];
            }
        }
        return list;
    }
}