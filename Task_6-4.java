/*
Последовательность Фибоначчи образуется так: первый и второй члены последовательности равны 1, каждый 
следующий равен сумме двух предыдущих (1, 1, 2, 3, 5, 8, 13, ...). Дано натуральное число n. 1. Найти: 
1.k-йчлен последовательности Фибоначчи. 
2.Получить первые n членов последовательности Фибоначчи. Решить задачу с помощью рекурсивных функций
*/

import java.util.*;

public class Main {
  
// Task #1
    
    public static long fibonachiSerchK(int k) {
      
      if(k == 1 || k == 2)
        return 1;
        
        return fibonachiSerchK(k - 1) + fibonachiSerchK(k - 2);
    }
    
    public static void fibonachiPrintN(int n) {
      
      int a = 1;
      int b = 1;
      int count = 0;
  
      System.out.print(a + " " + b + " ");
      for (int i = 3; i <= n; i++) {
        count++;
        int sum = a + b;
        System.out.print(sum + " ");
        a = b;
        b = sum; 
      }
      System.out.println( );
      
    }
    
    public static void main(String[] args) {
      
      System.out.printf("%d-ый член последовательности Фибоначчи равен \n", fibonachiSerchK(11));
      fibonachiPrintN(12);
    }
}