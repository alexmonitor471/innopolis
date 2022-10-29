/*
Реализовать фуецию, которая принимает на вход два числа n и m и возвращает n^m
Реализовать перегрузку для разных типов данных
*/

// Классический способ с циклом

import java.util.*;

public class Main {
    
  public static int mult(int a, int b) {
      
      int mult = 1;
      int count = 0;
        
      for(int i = 1; i <= b; i++) {
        mult = mult*a;
        count++;
      } 
      
      return mult;
  }
  
  public static double mult(double a, double b) {
      
      double mult = 1;
      int count = 0;
        
      for(int i = 1; i <= b; i++) {
        mult = mult*a;
        count++;
      } 
      
      return mult;
  }
      
    public static void main(String[] args) {
      
      
      double a = 3.5;
      double b = 3;
      double x = mult(a, b);
      System.out.println(x);
      
      System.out.println(mult(-2, 3));
    
  }
}