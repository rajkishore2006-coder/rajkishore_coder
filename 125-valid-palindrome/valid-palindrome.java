class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        String str = "";

        for(int i = s.length()-1; i >= 0; i--) {
            str += s.charAt(i);
        }

        if(s.equals(str)) {
            return true;
        }

        return false;
    }
}
  
        
    
