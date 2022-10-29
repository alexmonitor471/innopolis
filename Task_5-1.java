import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Введите число: ");
      int number = sc.nextInt();
      
      System.out.println("Введите количество выводов числа: ");
      int quantity = sc.nextInt();
      
      for (int i = 1; i <= quantity; i++) {
        System.out.print(number + " ");
      }

        
    }
}

