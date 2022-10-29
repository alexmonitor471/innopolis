/* Известно значение температуры по шкале Цельсия 36,6. 
Найти соответствующее значениетемпературы по шкале:
1.Фаренгейта;
2.Кельвина.
Для пересчета пошкале Фаренгейта необходимо исходное значение температуры умножить на 1,8 
и к результату прибавить 32, а по шкале Кельвина абсолютное значение нуля 
соответствует 273,15 градуса по шкале Цельсия */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите градусы по Цельсию: \n");
        double celsius = scan.nextDouble();
        
//      Scanner in = new Scanner(System.in);  // Второй вариант ввода данных
//        double celsius = in.nextDouble();  
        
        double fahrenheit = ((celsius*1.8)+32);
        double kelvin = (celsius + 273.15);
        
        System.out.println(celsius + " Градусов по Цельсию это: " + fahrenheit + " градусов по Фаренгейту\nи " + kelvin + " градусов по Кельвину\n");
        System.out.printf("%.2f Градусов по Цельсию =  %.2f градусам по Фаренгейту\nи = %.2f градусам по Кельвину", celsius, fahrenheit, kelvin);
 

        
    }
}