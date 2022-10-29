/*
Найти сумму всех целых чисел от 100 до 500
*/

// Найти сумму всех целых чисел от 100 до 500

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      int sum = 0;
      
      for(int i = 100; i <= 500; i++) {
//        System.out.println("====================");
//        System.out.println("i = " + i);
//        System.out.println("Сумма до внесения изменений " + sum);
        sum = sum + i;
//        System.out.println("Сумма после внесения изменений " + sum);
      }
      
      System.out.println("Сумма диапозона равна " + sum);
      
// Найти сумму всех целых чисел от a до b (значения a и b вводятся с клавиатуры; b>=a)     
      
      int sum1 = 0;
      
      for(int i1 = a; i1 <= b; i1++) {
//        System.out.println("====================");
//        System.out.println("i = " + i);
//        System.out.println("Сумма до внесения изменений " + sum);
        sum1 = sum1 + i1;
//        System.out.println("Сумма после внесения изменений " + sum);
      }
      
      System.out.println("Сумма диапозона равна " + sum1);
  }
}