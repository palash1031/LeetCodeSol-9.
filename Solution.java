class Solution {
    public boolean isPalindrome(int x) {
        String stringX = String.valueOf(x);
        char[] charArray = stringX.toCharArray();
        int frontCount = 0;
        int backCount = charArray.length-1;

        while(frontCount < backCount) {
            if(charArray[frontCount] != charArray[backCount]){
                return false;
            }
            frontCount++;
            backCount--;
        } 
        return true;
        }
    }
