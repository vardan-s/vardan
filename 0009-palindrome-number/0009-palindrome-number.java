class Solution {
    public boolean isPalindrome(int x) {
        int n,d=0;
        n=x;
        while(x>0)
        {
            int a=x%10;
            d=d*10+a;
            x=x/10;
        }
        boolean result=(n==d);
        if(result)
        return result;
        return result;
    }
}