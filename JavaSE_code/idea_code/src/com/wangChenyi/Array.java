package com.wangChenyi;

import java.sql.SQLOutput;

public class Array {
    public static void main(String[] args) {
        //这是静态的数组定义格式
        //定义的格式  整数默认 0
        //小数默认0.0  字符默认 null  布尔默认 空
        int[] arr = {11,22,33,44,55};
        int max =arr[0];
        for (int x =1;x<arr.length;x++){
            if(arr[x]>max){
               max=arr[x];
            }
        }
        System.out.println(max);
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }
    /*public static void main(String[] args) {
        //这是动态的数组定义格式
        int[] arr = new  int[3];
        int[] arr2=new  int[2];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        arr2[0]=100;
        arr2[1]=200;
        System.out.println(arr);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
    }
*/



}
