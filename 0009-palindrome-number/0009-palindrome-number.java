class Solution {
    public boolean isPalindrome(int x) {        
        int r = 0;
        int reverse = 0;
        
        int a = x;
        
        while(x>0){
            r = x % 10;
            reverse = (reverse * 10) + r;
            
            x = x / 10;
        }
        if(a == reverse){
            return true;
        }
        return false;
    }
}