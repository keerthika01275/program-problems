package geeks_for_geeks;
public class length_last_word {
    public static int lengthOfLastWord(String s) {
       s.trim();
       String arr[]=s.split(" ");
       return arr[arr.length-1].length(); 
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
}
