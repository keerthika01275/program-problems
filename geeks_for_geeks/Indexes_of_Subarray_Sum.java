package geeks_for_geeks;
import java.util.*;
class Indexes_of_Subarray_Sum{
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        
       ArrayList<Integer> list = new ArrayList<>();
        int sum = 0, k = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            while (sum > target && k <= i) {
                sum -= arr[k++];
            }

            if (sum == target) {
                list.add(k + 1);   
                list.add(i + 1);
                return list;
            }
        }

        list.add(-1);
        return list;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target=15;
        System.out.println(subarraySum(arr, target));
    }
}

