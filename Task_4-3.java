/* Дано двузначное число. Определить: 
    1. Является ли сумма его цифр двузначным числом
    2. Больше ли самого числа сумма его цифр */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите количество полученныx очков: ");

        byte x = scan.nextByte();

        int a = Math.abs(x/10);
        int b = Math.abs(x%10);
        
        if((a+b)>9){
          System.out.println("Сумма цифр числа " + x + " является двузначным числом");
        }
        else {
          System.out.println("Сумма цифр числа " + x + " не является двузначным числом");
        }
        
        if((a+b)>x) {
          System.out.println("Сумма цифр числа " + x + " больше самого числа");
        }
        else {
          System.out.println("Сумма цифр числа " + x + " меньше самого числа");
        }
        
    }
}