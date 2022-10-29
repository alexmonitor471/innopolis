/* Даны два числа. Если квадратный корень из второго числа меньше первого числа, то увеличить второе число в пять раз */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double x = scan.nextDouble();
        
        System.out.println("Введите второе число: ");
        double y = scan.nextDouble();
        
        if(Math.sqrt(y)<x) {
          double z1 = y*5;
          System.out.println(z1 + " . Если положительный корень второго числа меньше первого числа");
        } 
        
        if((Math.sqrt(y)*(-1))<x) {
          double z2 = (y*(-1))*5;
          System.out.println(z2 + " . Если отрицательное значения корня второго числа меньше первого числа");
        } 
        
    }
}