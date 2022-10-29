/* 
Дано натуральное число. Определить: 
1.количество цифр 3 в нем; 
2.сколько раз в нем встречается последняя цифра; 
3.количество четных цифр в нем;
4.сумму ег оцифр, больших пяти; 
5.произведение его цифр, больших семи; 
6.сколько раз в нем встречаются цифры 0 и 5
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    
// 1. Количество цифр 3 в числе  
      
    long number1 = sc.nextInt();
    long countOfThree = 0;
    long countOfUltim = 0;
    long countOfEven = 0;
    int countOf0or5 = 0;
    
    System.out.println("Оригинальное число " + number1);
    
    long number = Math.abs(number1);
    
    while(number != 0) {
      long ending = number % 10;
      
      if(ending == 3) {
        countOfThree++;
      }
      
      number = number / 10;
    }
    
    System.out.printf("1. Цифра 3 встречается в числе %d раз\n", countOfThree);
    
// 2. Сколько раз в чиле встречается последняя цифпа

    long k = Math.abs(number1 % 10);
    long number2 = Math.abs(number1);
    
    while(number2 != 0) {
      
      long ending1 = number2 % 10;
      if(ending1 == k) {
        countOfUltim++;
        }
      
      number2 = number2 / 10;
      }

    System.out.printf("2. Последняя цифра числа %d встречается %d раз в этом числе\n", k, countOfUltim);
    
// 3. Количество чётных цифр в нём

    long number3 = Math.abs(number1);
    
    while(number3 != 0) {
      long ending = number3 % 10;
      
      if(ending % 2 == 0) {
        countOfEven++;
      }
      
      number3 = number3 / 10;
    }
    
    System.out.printf("3. Чётная цифра встречается в нем %d раз\n", countOfEven);
    
// 4. Сумма цифр, которые больше 5
    
    long number5 = Math.abs(number1);
    long sum = 0;
    
    while(number5 != 0) {
      long ending = number5 % 10;
      
      if(ending > 5) {
        sum = sum + ending;
      }
      
      number5 = number5 / 10;
    }
    
    System.out.printf("4. Сумма цифр больше 5 равна %d.\n", sum);
    
// 5. Произведение его цифр, больших семи
    
    long number6 = Math.abs(number1);
    long multi = 1;
    
    while(number6 != 0) {
      long ending = number6 % 10;
      
      if(ending >= 7) {
        multi = multi * ending;
      }
      
      number6 = number6 / 10;
    }
    
    System.out.printf("5. Произведение его цифр, больших семи равна %d.\n", multi);
    
// 6. Cколько раз в числе встречаются цифры 0 и 5 (всего)

    long number4 = Math.abs(number1);
    
    while(number4 != 0) {
      long ending = number4 % 10;
      
      if(ending  == 0 || ending  == 5) {
        countOf0or5++;
      }
      
      number4 = number4 / 10;
    }
    
    System.out.printf("6. Цифры 0 или 5 встречается в числе %d раз", countOf0or5);
    
  }
}