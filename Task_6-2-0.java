// Напечатать ёлочку 

import java.util.*;

public class Main {
    
    public static void printNumber(int number, int rows) {
      
      for(int i = 0; i < rows; i++) {
        for(int j = 0; j < i+1; j++) {
          System.out.print(number + " ");
        }
        System.out.println();
      }
    }
    
    public static void printText(String line, int columns, int rows) {
      
      for(int i = 0; i < rows; i++) {
        for(int j = 0; j < columns; j++) {
          System.out.print(line + " ");
        }
        System.out.println();
      }
    }
    
    public static void main(String[] args) {
      
      printNumber(5, 8);
      printText("Hi", 2, 3);
      
        int x;
      
  }
}