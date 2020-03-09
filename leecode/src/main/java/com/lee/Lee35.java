package com.lee;

public class Lee35 {
    public int searchInsert(int[] nums, int target) {
        if (nums==null || nums.length==0){
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            int c=nums[i];
            if (c==target){
                return i;
            }else if (c>target){
                return i;
            }
        }
        return nums.length;
    }
}
