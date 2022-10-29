// Градусы температуры в зависимости от выбранной температурной шкалы

import java.util.Scanner;
public class L4T2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите два числа: Первое - 1 - значение °");
      System.out.println("  Второе - шкала, где ");
      System.out.println("  1 - °С  2 - °F   3 - °K");
      System.out.println("");
      double grad = sc.nextDouble(); //значение в градусах
      int n = sc.nextInt();          //выбор базовой шкалы
      sc.close();
      switch (n) {
          case 1: {                 // шкала Цельсия
            double gradC = grad;
            double gradF = gradC * 1.8 + 32; // °C в градусы Фаренгейта (°F) 
            double gradK = gradC + 273.16;   // °C в градусы Кельвина (°К)
            System.out.printf("Введена температура  - %.2f °C %n", gradC);
            System.out.printf("Это по шкале Фаренгейта - %.2f °F %n", gradF);
            System.out.printf("Это по шкале Кельвина - %.2f °K %n", gradK);
            break;
          }
          case 2: {
            double gradF = grad;	// шкала Фаренгейта
            double gradC = (gradF - 32) * 5 / 9; // °F в градусы Цельсия (°C) 
            double gradK = gradC + 273.16;   // °F в градусы Кельвина (°К)
            System.out.printf("Введена температура  - %.2f °F %n", gradF);
            System.out.printf("Это по шкале Цельсия - %.2f °C %n", gradC);
            System.out.printf("Это по шкале Кельвина - %.2f °K %n", gradK);
            break;
          }
          case 3: {
            double gradK = grad;	// шкала Кельвина
            double gradF = gradK * 1.8 - 459.7; // °К в градусы Фаренгейта (°F) 
            double gradC = gradK - 273.16;   // °К в градусы Цельсия (°C)
            System.out.printf("Введена температура  - %.2f °K %n", gradK);
            System.out.printf("Это по шкале Цельсия - %.2f °C %n", gradC);
            System.out.printf("Это по шкале Фаренгейта - %.2f °F %n", gradF);
            break;
          }
          default: {
            System.out.println("Ошибка ввода " + n + " шкалы");
            break;
          }
      }
  }
}