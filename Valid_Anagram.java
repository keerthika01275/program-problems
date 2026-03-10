class Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
       int freq[] = new int[26];
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        freq[ch-'a']++;
       }
    for(int i=0;i<t.length();i++){
        char ch = t.charAt(i);
        freq[ch-'a']--;
        }
    for(int i:freq){
        if(i!=0) return false;
    }
return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("cat","act"));
    }

}
