package com.wangChenyi;

public class IntUse {
    public static void main(String[] args) {
//        isEvenNumber();
        getmax(10,30);
        int a =10;
        int b =34;
        getmax(a,b);
    }

    /*//定义一个变量是否为偶数,
        public static void isEvenNumber() {
            int number = 10;
            if (number % 2 == 0) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }*/
    //这是不带参数的做法
    /*public static void getmax() {
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        */

//    下面这是带参数的做法;格式如下:
    // 参数是由 数据类型和变量名组成   __ 数据类型 变量名
//注意:  方法定义时   参数中的数据类型与变量名都不能缺少,缺少任意一个都会报错, 在多个参数时 要用,隔开
    public static void getmax(int a,int b){
        if (a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
//    带返回值方法的定义和调用
    // 定义格式:   pubic static 数据类型 方法名 (参数){returm 数据}
}
