class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long res=0;
        int n=nums.length;
        long min=Integer.MAX_VALUE;
        long  max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        res=(long)(k*(max-min));
            
        
        return res;
        
    }
}