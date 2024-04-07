class Solution {
    public boolean isAnagram(String s, String t) {
        String[] s1 = s.split("");
        Arrays.sort(s1);
        String s2 = String.join("", s1);
        String[] t1 = t.split("");
        Arrays.sort(t1);
        String t2 = String.join("", t1);
        if(s2.equals(t2)){
            return(true);
        } else{
            return(false);
        }
    }
}