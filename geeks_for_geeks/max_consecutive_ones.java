package geeks_for_geeks;
public class max_consecutive_ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        // 1 1 0 1 1 1  3
        int one =0,val=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                one++;
                val = Math.max(val,one);
            }
            else{
                one =0;
            }
        }
        return val;
    }
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1}));
    }
}
