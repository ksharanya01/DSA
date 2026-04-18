class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        int x=n;
        while(x>0){
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        int res=Math.abs(n-rev);
        return res;
        
    }
}