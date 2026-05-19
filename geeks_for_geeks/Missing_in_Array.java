package geeks_for_geeks;
import java.util.*;
class Missing_in_Array {
  public static  int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n =-1,val=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                n = val;
                break;
            }
            val++;
        }
        if(n==-1) return arr.length+1;
        return n;
    }
    public static void main(String[] args) {
        int arr[]={8, 2, 4, 5, 3, 7, 1};
        System.out.println(missingNum(arr));
    }
}