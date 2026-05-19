package Binary_Search;

public class b5_minimum_in_rotated_sorted_array {
    public static void main(String[] args) {
       int arr[]  = {4,5,6,7,0,1,2};
       int min = Integer.MAX_VALUE;
       int left =0,right=arr.length-1;
       while(left<=right){
           if(arr[left]<=arr[right]){
               min = Math.min(min,arr[left]);
               System.out.println(min);
               break;
           }
           int mid = left+(right-left)/2;
           if(arr[left]<=arr[mid]){
               min = Math.min(arr[left],min);
               left = mid+1;
           }
           else{
               min = Math.min(arr[mid],min);
               right = mid-1;
           }
       }
      
    }
}
