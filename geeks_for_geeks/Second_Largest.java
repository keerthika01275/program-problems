package geeks_for_geeks;
class Solution {
    public static int getSecondLargest(int[] arr) {
        int max=-1,max1=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max1=max;
                max = arr[i];
            }
            else if(arr[i]>max1&&arr[i]<max){
                max1=arr[i];
            }
        }
        return max1;
    }
    public static void main(String args[]){
        int arr[]={12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));
    }
}