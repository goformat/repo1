package com.wangChenyi;

public class qiuzuizhi {
    public static void main(String[] args) {
      int[] arr={12,34,55,6,65,77};
      int minte=arr[0];
      for (int i = 0;i<arr.length;i++){
          if(arr[i]<minte){
              minte=arr[i];
          }
      }
        System.out.println(minte);
    }
}
