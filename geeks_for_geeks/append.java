package geeks_for_geeks;
//Append Characters to String to Make Subsequence

public class append{
   public static int appendCharacters(String s, String t) {
      int i=0,j=0,m=t.length(),n=s.length();
      while(i<m&&j<n){
        char a = t.charAt(i);
        char b = s.charAt(j);
        if(a==b){
            i++;
        }
        j++;
      }
      return t.length()-i;
    }
    public static void main(String[] args) {
        System.out.println(appendCharacters("coaching", "coading"));
    }
}
