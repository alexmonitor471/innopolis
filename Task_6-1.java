/* Написать метод, который принимает на вход натуральное число и возвращает true, если число чётное */

import java.util.*;

public class Main {
    
  public static void even(int a) {

    if(a >= 0 && a%2 == 0) {
      System.out.printf("Число %d является чётным\n", a);
    }
    else if(a >= 0 && a/2 != 0) {
      System.out.printf("Число %d не является чётным\n", a);
    }
      else
        System.out.printf("Число %d не натуральное\n", a); 
  }
  
  public static boolean even1(int a) {

    if ((a % 2) == 0){ 
        return true; 
    } 
    else  
      return false; 
  }

    
  public static void main(String[] args) {
      
    even(13);
    System.out.println(" =============== ");
    int j = 7;
    
    System.out.println(even1(j));
    System.out.println(" =============== ");
    System.out.println();
    
  }
}