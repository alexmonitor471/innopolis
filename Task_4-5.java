/* Даны три вещественных числа a, b, c. Проверить: 
        1. выполняется ли неравенство a < b < c; 
        2. выполняется ли неравенство b > a > c.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double a = scan.nextDouble();
        
        System.out.println("Введите второе число: ");
        double b = scan.nextDouble();
        
        System.out.println("Введите третье число: ");
        double c = scan.nextDouble();
        
        boolean result1 = (a<b) && (b<c);
        boolean result2 = (b>a) && (a>c);

        System.out.println("a < b < c  =  " + result1);
        System.out.println("b > a > c  =  " + result2);
      
    }
}