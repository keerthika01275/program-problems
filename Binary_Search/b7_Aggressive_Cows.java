package Binary_Search;
import java.util.*;
public class b7_Aggressive_Cows {
    public static void main(String[] args) {
       int stalls[] = {1,2,4,8,9};
       int k =3,ans=0;
       Arrays.sort(stalls);
       int left =1,right=stalls[stalls.length-1]-stalls[0];
       while(left<=right){
           int mid = left+(right-left)/2;
           if(possible(mid,k,stalls)){
               ans = mid;
               left = mid+1;
           }
           else{
               right = mid-1;
           }
           }
           System.out.println(ans);
    }
    public static boolean possible(int mid,int k,int stalls[]){
       int last = stalls[0],cow=1;
       for(int i=1;i<stalls.length;i++){
           if(stalls[i]-last>=mid){
               last = i;
               cow++;
           }
       }
       return cow>=k;
    }

}
