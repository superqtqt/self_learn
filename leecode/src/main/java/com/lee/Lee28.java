package com.lee;

public class Lee28 {
    public static void main(String[] args) {
        Lee28 lee28=new Lee28();
        lee28.strStr("mississippi",
                "issip");
    }
    public int strStr(String haystack, String needle) {
        if (haystack==null || needle==null){
            return -1;
        }
        if (haystack.equals(needle)||needle.equals("")){
            return 0;
        }
        char [] c1=haystack.toCharArray();
        char [] c2=needle.toCharArray();
        int j=0;
        for (int i = 0; i < c1.length; i++) {
            if (c1[i]==c2[j]){
                if (j==c2.length-1){
                    return i-c2.length+1;
                }
                j++;
            }else {
                j=0;
            }
        }
        return -1;
    }
}
