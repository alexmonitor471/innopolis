/* Задача №1
проверка на четность с помощью битовых операций
*/

import java.util.Scanner;
public class Lect6Self1 {
  
    public static boolean even (int n) {
      byte mask = 1;
      byte lastByte = (byte) n;
      if ((lastByte & mask) == 1) {
        return false;
      } else return true;
    }
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите n - ");
      int n = sc.nextInt();
      sc.close();
      System.out.println((even(n)) ? (n +" - четное число") : (n + " - нечетное число"));
  }
}