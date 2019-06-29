package com.wangChenyi;

public class jishuhe {
    public static void main(String[] args) {
        int[] arr={12,34,55,6,65,77};
        int sum=0;
        for (int i = 0;i<arr.length;i++){
            int a =arr[i];
//            System.out.println(a);
            if (a%2==1){
                System.out.println(a);
//
            sum += a;}
        }
        System.out.println("^^^^^^^^^^^^^^^");
        System.out.println(sum);
    }
}
