package org.example;

import lek1.HW3_List2chain;

public class Main {
    public static void main(String[] args) {
        HW3_List2chain list = new HW3_List2chain();
        list.adding(25);
        list.adding(35);
        list.adding(45);
        list.view_list();
        list.revese();
        list.view_list();
    }

//    public static void main(String[] args) {
//        Integer[] sourced = new Integer[]{1,32,23,26,2,10,18};
//        pyramidal(sourced);
//        for (int i = 0; i < sourced.length; i++) {
//            System.out.println(sourced[i]);
//        }
//    }
//
//    public static void pyramidal(Integer[] sourced) {
//        for (int i = (sourced.length)/2-1; i >=0 ; i--) {
//            helpy(sourced,sourced.length,i);
//        }
//        for (int i = sourced.length-1; i >=0; i--) {
//            int box = sourced[0];
//            sourced[0]=sourced[i];
//            sourced[i]=box;
//
//
//            helpy(sourced,i,0);
//        }
//
//    }
//
//    public static void helpy(Integer[] sourced, int length, int index) {
//        int largest = index; //indexes of elements
//        int lchild = 2*index+1;
//        int rchild = 2*index+2;
//
//        if (lchild<length && sourced[lchild]>sourced[largest]){
//            largest =lchild;
//        }
//        if (rchild<length && sourced[rchild]>sourced[largest]){
//            largest = rchild;
//        }
//        if (index != largest){
//            int box = sourced[index];
//            sourced[index] = sourced[largest];
//            sourced[largest] = box;
//            helpy(sourced,length,largest);
//        }
//
//    }
}