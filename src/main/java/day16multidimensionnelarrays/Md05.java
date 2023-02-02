package day16multidimensionnelarrays;

import java.util.Arrays;

public class Md05 {
    public static void main(String[] args) {
  //
  int a[][]  ={{2,3},{5,6}} ;
  int carpim=1;

  for (int [] w:a){
      for (int k:w){

     carpim*=k;
      }
  }
        System.out.println(carpim);
    }
}
