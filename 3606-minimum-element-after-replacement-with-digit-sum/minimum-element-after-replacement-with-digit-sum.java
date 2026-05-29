class Solution {
    public int minElement(int[] nums) {
        int sum[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int sums=0;
            while(n!=0){
                int rem=n%10;
                sums+=rem;
                n=n/10;

            }
            sum[i]=sums;
        }
        int min=sum[0];
        for(int x:sum){
            min=Math.min(x,min);
        }
        return min;
        
    }
}