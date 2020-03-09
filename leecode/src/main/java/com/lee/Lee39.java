package com.lee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lee39 {
    public static void main(String[] args) {
        List<Integer> rs=new ArrayList<Integer>(Arrays.asList(2,3,6,7));
        Lee39 lee39=new Lee39();
        lee39.combinationSum(new int[]{2,3,6,7},7);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> rs=new ArrayList<List<Integer>>();
        for (int i = 0; i <candidates.length; i++) {
            int m=candidates[i];
            if (m==target){
                List<Integer> temp=new ArrayList<Integer>();
                temp.add(m);
                rs.add(temp);
            }else if (m<target){
                List<Integer> temp=new ArrayList<Integer>();
                temp.add(m);
                find(rs,temp,m,candidates,target);
            }

        };
        return rs;
    }

    public void find(List<List<Integer>> rs,List<Integer> current,int v,int[] candidates, int target){

        for (int i = 0; i < candidates.length; i++) {
            int m=candidates[i];
            if (v+m==target){
                List<Integer> tmp=new ArrayList<Integer>(current);
                tmp.add(m);
                rs.add(tmp);
            }else if (v+m<target){
                List<Integer> tmp=new ArrayList<Integer>(current);
                tmp.add(m);
                find(rs,tmp,v+m,candidates,target);
            }
        }
    }
}
