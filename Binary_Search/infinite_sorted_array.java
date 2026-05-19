package Binary_Search;
//length is unknown
public class infinite_sorted_array {
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
       int target = 11;
       int left =0,right=1;
       while(target>arr[right]){
           left = right;
           right = right*2;
       }
       System.out.println(right+" "+left);
       while(left<=right){
           int mid = left+(right-left)/2;
           if(arr[mid]==target){
               System.out.println(mid);
               break;
           }
           else if(arr[mid]>target){
               right = mid-1;
           }
           else{
               left = mid+1;
           }
       }
      
    }
}
