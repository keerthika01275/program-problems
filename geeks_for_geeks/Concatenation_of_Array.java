package geeks_for_geeks;
import java.util.*;
class Concatenation_of_Array {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int arr[]=new int[2*n];
        int j=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=nums[j++];
            if(j>=nums.length) j=0;
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums[]={22,21,20,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}