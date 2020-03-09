package com.lee;

public class Lee41 {
    public static void main(String[] args) {
        Lee41 lee41=new Lee41();
        System.out.println(lee41.firstMissingPositive(new int[]{1,1}));
    }
    public int firstMissingPositive(int[] nums) {
        if (nums==null||nums.length==0){
            return 1;
        }
        int len=nums.length;
        for (int i = 0; i < len; i++) {
            int v=nums[i];
            while (v>0 &&v<len&&v!=i+1&&nums[v-1]!=v){
                int tmp=nums[v-1];
                nums[v-1]=v;
                nums[i]=tmp;
                v=tmp;
            }
        }
        for (int i = 0; i <len; i++) {
            if (nums[i]!=i+1){
                return i+1;
            }
        }
        return len+1;

    }
}
