class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],i);
            if(map.size()>k){
                map.remove(nums[i-k]);
            }
        }
        return false;
        
    }
}