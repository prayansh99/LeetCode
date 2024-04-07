class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String temp = "";
        for(char ch : s.toCharArray()){
            if(!Character.isLetterOrDigit(ch)) {
                continue;
            } else {
                temp += ch;
            }
        }
        for(int i = 0; i < (temp.length()/2); i++) {
            if(temp.charAt(i) == temp.charAt(temp.length() - i - 1)) {
                continue;
            } else {
                return(false);
            }
        }
        return true;
    }
}