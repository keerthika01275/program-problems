package Binary_Search;

public class peak_element {
     public static void main(String[] args) {
       int arr[] = {1,3,5,6,12,4,3,2,1};
       int left =0,right=arr.length-1;
        while(left<=right){
           int mid = left+(right-left)/2;
            if(arr[mid]>arr[mid+1]){
               
               right = mid-1;
           }
           else{
               left = mid+1;
           }
       }
       System.out.println(left);
    }
}
