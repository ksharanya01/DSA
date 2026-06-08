class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int x=0;
        int piv[]=new int[nums.length];
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>equal=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                piv[x]=nums[i];
                x++;

            }else if(nums[i]>pivot){
                list.add(nums[i]);
                
            }else{
                equal.add(pivot);
            }
        }
        for(int z:equal){
            piv[x]=z;
            x++;
        }
        for(int z:list){
            piv[x]=z;
            x++;
        }
        return piv;
        
    }
}