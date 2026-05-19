package geeks_for_geeks;
public class Is_Subsequence {
    public static boolean isSubsequence(String s, String t) {
        int i=0,j=0,m=s.length(),n=t.length();
        while(i<m&&j<n){
            char a = s.charAt(i);
            char b = t.charAt(j);
            if(a==b){
                i++;
                }
            j++;
        }
        return i==m;
    }
    public static void main(String[] args) {
        System.out.println(isSubsequence("cat","cgfjahvt"));
    }
}
