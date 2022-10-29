/*
Напечатать таблицу соответствия между весом в фунтах и весом в килограммах для значений 1, 2, ..., 10 фунтов (1 фунт = 453 г)
*/

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      
      for (int i = 1; i <= 10; i++) {
        System.out.printf("%d фунтов соответствует %.3f килограммам \n", i, i*0.453);
      }

        
    }
}

