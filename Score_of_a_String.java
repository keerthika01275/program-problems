class Score_of_a_String  {
    public static int scoreOfString(String s) {
        int val=0;
        for(int i=0;i<s.length()-1;i++){
           val += Math.abs(s.charAt(i+1)-s.charAt(i));
        }
        return val;
    }
    public static void main(String[] args) {
        String s="code";
        System.out.println(scoreOfString(s));
    }
}