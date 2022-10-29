/* Вчемпионате пофутболу команде за выигрыш дается 3 очка, за проигрыш — 0, за ничью — 1. Известно количество очков, полученных командой за игру.
 Определить словесный результат игры (выигрыш, проигрышилиничья) */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите набранные очки: ");
        byte a = scan.nextByte();

      
        if (a == 1)
          System.out.println("Ничья!");
     
        if (a == 3)  
          System.out.println("Выйгрыш!");

        if (a == 0)  
          System.out.println("Пройгрыш!");
        
    }
}