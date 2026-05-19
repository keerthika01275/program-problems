package Binary_Search;
class Main {
    public static void main(String[] args) {
        int piles[] = {3,6,7,11};
        int hours = 8;
        int right=0,left=1;
        for(int i :piles){
            right+=i;
        }
        int sum =right,ans=0;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(possible(mid,hours,sum)){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        System.out.println(ans);
    }
    public static boolean possible(int val,int hours,int sum){
        if(val*hours>=sum){
            return true;
        }
        else{
            return false;
        }
    }
}