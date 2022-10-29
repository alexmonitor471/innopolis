/* Вчемпионате пофутболу команде за выигрыш дается 3 очка, за проигрыш — 0, за ничью — 1. Известно количество очков, полученных командой за игру.
 Определить словесный результат игры (выигрыш, проигрышилиничья) */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите количество полученныз очков: ");

        byte points = scan.nextByte();

        switch(points)
        {
            case 0:
                System.out.println("Вы проиграли ((");
                break;
            case 1:
                System.out.println("Вы сыграли вничью");
                break;
            case 3:
                System.out.println("Вы выиграли матч!");
                break;

            default:
                System.out.println("Вы ввели неверное количество очков");
                break;
        }


    }
}