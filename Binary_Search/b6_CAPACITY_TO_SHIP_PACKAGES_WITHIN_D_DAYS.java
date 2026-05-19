package Binary_Search;

public class b6_CAPACITY_TO_SHIP_PACKAGES_WITHIN_D_DAYS {
     public static void main(String[] args) {
       int weights[] = {1,2,3,4,5,6,7,8,9,10};
       int days = 5; // 15 output
       int left =0,right=0;
       for(int i:weights){
           right+=i;
           left = Math.max(left,i);
       }
       int ans =0;
       while(left<=right){
           int mid = left+(right-left)/2;
           if(capacity(mid,days,weights)){
               ans = mid;
               right = mid-1;
           }
           else{
               left = mid+1;
           }
       }
       System.out.println(ans);
    }
    public static boolean capacity(int mid,int days,int weights[]){
        int day =1,sum=0;
        for(int i=0;i<weights.length;i++){
           if(sum+weights[i]>mid){
               day++;
               sum = weights[i];
           }
           else{
               sum+=weights[i];
           }
           if(day>days) return false;
        }
        return true;
    }
}
