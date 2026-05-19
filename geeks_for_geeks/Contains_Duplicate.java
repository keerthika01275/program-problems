package geeks_for_geeks;
class Contains_Duplicate {
    public static boolean hasDuplicate(int[] nums) {
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]) return true;
        }
    }
    return false;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 3};
        System.out.println(hasDuplicate(arr));
    }
}