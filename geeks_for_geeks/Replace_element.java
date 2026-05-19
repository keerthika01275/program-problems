package geeks_for_geeks;
//You are given an array arr, replace every element in that array with t
// he greatest element among the elements to its right,
//  and replace the last element with -1.
import java.util.*;
public class Replace_element {
    public static int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1];
        arr[arr.length-1] =-1;
        for(int i=arr.length-2;i>=0;i--){
            int val = arr[i];
            arr[i] = max;
             if(max<val) max = val;
        }
        return arr;
    }
    public static void main(String args[]){
        System.out.println(Arrays.toString(replaceElements(new int []{2,4,5,3,1,2})));
    }
}
