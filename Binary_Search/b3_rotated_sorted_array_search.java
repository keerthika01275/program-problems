package Binary_Search;

public class b3_rotated_sorted_array_search {
     public static void main(String[] args) {
       int arr[] = {4,5,6,7,8,0,1,2,3};
       int target =0;
       int left =0,right = arr.length-1;
       while(left<=right){
           int mid = left+(right-left)/2;
           if(arr[mid]==target){
               System.out.println(mid);
               break;
           }
           else if(arr[left]<=arr[mid]){
            if(target<arr[mid]&&target>=arr[left]){
               right = mid-1;
           }
           else{
               left = mid+1;
           }
           }
           else{
               if(target>arr[mid]&&target<=arr[right]){
               left = mid+1;
           }
           else{
               right = mid-1;
           }
           }
       }
      
    }
}
