package com.sort;

import java.util.List;

/**
 * @author circleliu 2020-03-18
 */
public class SortUtil {

    public static void swap(List list,int i,int j){
        Object iTemp=list.get(i);
        list.set(i,list.get(j));
        list.set(j,iTemp);
    }

    public static void swap(Object [] list,int i,int j){
        Object iTemp=list[i];
        list[i]=list[j];
        list[j]=iTemp;
    }
    public static void swap(int [] list,int i,int j){
        int iTemp=list[i];
        list[i]=list[j];
        list[j]=iTemp;
    }
}
