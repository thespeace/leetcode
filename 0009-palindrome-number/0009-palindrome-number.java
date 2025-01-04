class Solution {
    public boolean isPalindrome(int x) {
        String stringX = Integer.toString(x);
        String reverseX = new StringBuilder(stringX).reverse().toString();
        
        if(x >= 0)
            if(stringX.equals(reverseX))
                return true;
        
        return false;
    }
}