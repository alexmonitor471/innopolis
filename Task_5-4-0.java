/*
Вычислить сумму 1 + 1/2 + 1/3 + ... + 1/n
*/

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      double sum = 0;
      int n = sc.nextInt();
      
      for (int i = 1; i <= n; i++) {

        sum = sum + 1.0/i;
      }
        System.out.println("=============");
        System.out.printf("Сумма равна %f\n", sum);
    }
}