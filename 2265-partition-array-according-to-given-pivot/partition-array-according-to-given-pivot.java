class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int i1 = 0;
        int j1 = nums.length - 1;
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) ans[i1++] = nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > pivot) ans[j1--] = nums[i];
        }
        for (int k = i1; k <= j1; k++) {
            ans[k] = pivot;
        }

        return ans;
    }
}