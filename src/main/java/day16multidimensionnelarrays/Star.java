package day16multidimensionnelarrays;

public class Star {
    public static void main(String[] args) {
          /*
      Asagıdaki sekli cizen kodu yaziniz
                     *
                    * *
                   *   *
                  *     *
                 * * * * *
      */
        int row = 5;
        for (int i = 1; i < row; i++) {
            for (int k = 1; k < row; k++) {
                System.out.println(" ");
            }

            for (int m = 1; m <= 2 * i - 1; i++) {
                if (m == 1 || m == 1 || m == 2 * i - 1) {
                    System.out.println("*");
                } else {
                    System.out.println(" ");
                }
            }
        }
    }
}


