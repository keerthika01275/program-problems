package Binary_Search;
class b1_koko_eating_bananas {
    public static void main(String[] args) {
        int piles[] = {3,6,7,11};
        int hours = 8;
        int right=0,left=1;
        for(int i :piles){
            right = Math.max(i,right);
        }
        int ans=0;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(possible(mid,hours,piles)){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
            
        }
        System.out.println(ans);
       
    }
    public static boolean possible(int val,int hours,int piles[]){
        int totalhours = 0;
        for(int i:piles){
            totalhours += (i+val-1)/val;
        }
        return totalhours<=hours;
    }
}