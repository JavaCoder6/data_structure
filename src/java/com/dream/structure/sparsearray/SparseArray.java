package com.dream.structure.sparsearray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author lisifan
 * @Auther: lisifan
 * @Date: 2023/01/17/22:45
 * @Description: 稀疏数组
 */

public class SparseArray {

    static {

    }


    public static void main(String[] args) {
        //需求 一个二维数组 变成一个稀疏数组
        int h = 20;
        int w = 20;
        int[][] ints = new int[h][w];
        for (int i = 0; i < ints.length; i++) {
            for (int i1 = 0; i1 < ints[i].length; i1++) {
                ints[i][i1] = 0;
            }
        }
        ints[1][5] = 1;
        ints[1][6] = 2;
        ints[2][5] = 1;
        ints[2][6] = 2;
        ints[3][5] = 1;
        ints[3][6] = 2;
        ints[4][5] = 1;
        ints[4][6] = 2;
        int w1 = ints.length;
        int h1 = ints[1].length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int i1 = 0; i1 < ints[i].length; i1++) {
                if (ints[i][i1] != 0) {
                    count++;
                }
            }
        }
        int[][] ints1 = new int[3][count + 1];
        ints1[0][0] = w1;
        ints1[1][0] = h1;
        ints1[2][0] = 0;
        int sh = 1;
        for (int i = 0; i < ints.length; i++) {
            for (int i1 = 0; i1 < ints[i].length; i1++) {
                if (ints[i][i1] != 0) {
                    ints1[0][sh] = i;
                    ints1[1][sh] = i1;
                    ints1[2][sh] = ints[i][i1];
                    sh ++;
                }
            }
        }
        for (int[] ints2 : ints1) {
            for (int i : ints2) {
                System.out.print(i+":");
            }
            System.out.println();
        }
       System.out.println(Arrays.toString(ints1));

//        int count = 0 ;
//        for (int[] anInt : ints) {
//            for (int i : anInt) {
//                count++;
//                System.out.println(i);
//            }
//        }


    }

}
