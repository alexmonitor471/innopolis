// Задача про боксеров. Вариант№2 с делением списка посредине Вариант  №1 "Лесенка" в Лекции №4

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите вес спорсмена: ");
        double a = scan.nextDouble();
        
/*      
        if(a<75) {
          if(a<60) {
            System.out.println("A");
          }
          else {
            System.out.println("B");
          }
        }
        else {
          if(a<91) {
            System.out.println("C");
          }
          else {
            System.out.println("D");
          }
        }
*/

        if(a<60) {
          if(a<37) {
            if(a<=0) {
              System.out.println("Ваши данные некорректны");
            }
            else {
              System.out.println("Вам надо набрать вес для участия в соревнованиях");
            }
          }
          else {
            if(a>37) {
              System.out.println("Вы выступаете Лёгкой весовой категории");
            }
            else {
              System.out.println("вам надо набрать вес для участия в соревнованиях");
            }
          }
        }
        else {
          if(a<91) {
            if(a<75) {
              System.out.println("Вы выступаете Средней весовой категории");
            }
            else {
              System.out.println("Вы выступаете Тяжелой весовой категории");
            }
          }
          else {
            System.out.println("Вы выступаете Супертяжелой весовой категории");
          }
        }
      
    }
}