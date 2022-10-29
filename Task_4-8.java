/* Известны площади круга и квадрата. Определить: 
  1.уместится ли круг в квадрате? 
  2.уместится ли квадрат в круге? */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите площадь квадрата: ");
        double a = scan.nextDouble();

        System.out.println("Введите площадь круга: ");
        double b = scan.nextDouble();

        double L = Math.sqrt(2*a); // Длина гипотенузы (длина диагонали квадрата)
        double C = Math.sqrt(b / (Math.PI));   // Длина радиуса
        
        System.out.printf("Диагональ квадрата = %.2f\n", L);
        System.out.printf("Сторона квадрата = %.2f\n", Math.sqrt(a));
        System.out.printf("Диаметр круга = %.2f\n", C*2);
        
        boolean result1 = (L<=C*2);
        System.out.println("Квадрат уместиться в круг = " + result1);
        
        boolean result2 = (Math.sqrt(a)>=C*2);
        System.out.println("Круг уместиться в квадрат = " + result2);
        
    }
}