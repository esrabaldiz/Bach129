package day16multidimensionnelarrays;

import java.util.Arrays;

public class Md04 {
    public static void main(String[] args) {

 //Example 1: Bir multi-dimensional array olusturunuz ve bir dimensional'li array donusturunuz.
//           [ [2, 5], [3] , [4,7,11] ] ==> [2, 5, 3, 4, 7, 11]

int a[][]={{2,5},{4,7,11}};
        System.out.println(Arrays.deepToString(a));
//a array indeki toplam eleman sayisini bulunuz

 int sum=0;
 for (int[] w:a){
     sum=sum+w.length;
 }
 // b isimli tek dimensionnelli bir array olusturunuz
 int  b[] =new int[sum];
        System.out.println(Arrays.toString(b));
 // "a" arrayindeki elemanlari b arrayine transfer ediniz

   int idx=0;
  for (int [] w: a) {
      for (int k : w) {
       b[idx]=k;
       idx++;
      }

      }
        System.out.println(Arrays.toString(b));
  }

    }

