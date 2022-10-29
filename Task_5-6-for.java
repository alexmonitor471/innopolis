/*
Последовательность Фибоначчи образуется так: первый и второй членып оследовательности равны 1, каждый следующий равен сумме двух 
предыдущих (1, 1, 2, 3, 5, 8, 13, ...). 
Дано натуральное число n. 
1.Найти k-й член последовательности Фибоначчи. 
2.Получить первые n членов последовательности Фибоначчи. 
3.Верно ли, что сумма первых n членов последовательности Фибоначчиесть четное число?
*/

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int k = sc.nextInt();
      int n = sc.nextInt();
      
// 1. Найти k-ый член последовательности Фибоначчи
       
      int a1 = 1;
      int b1 = 1;
      for (int i = 0; i < k - 2; i++) {
        int sum1 = a1 + b1;
        a1 = b1;
        b1 = sum1;
      }
      System.out.printf("Значение %d-го элемента последовательности Фибоначчи = %d\n", k, b1);  

// 2. Получаем первые n членов последовательности Фибоначчи 
      int a2 = 1;
      int b2 = 1;
      int sum2;
      System.out.print(a2+" "+b2+" ");
      for(int i = 3; i <= n; i++) {
        sum2 = a2 + b2;     //  Находим следующее число последовательности
        System.out.print(sum2+" ");   
        a2 = b2;  // Присваиваем новые значения и повторям цикл пока i <= n
        b2 = sum2;
      }
      System.out.println();
      
// 3. Сумма первых n членов последовательности Фибоначчиесть четное число?     
      
      if(sum2%2 == 0) {
        System.out.printf("Сумма первых чисел последовательности Фибаначчи до %d-го члена последовательности чётное число и равна %d", n, sum2);
      }
      else {
        System.out.printf("Сумма чисел последовательности Фибаначчи до %d-го члена последовательности нечётное число и равна %d", n, sum2);
      }
	}
}