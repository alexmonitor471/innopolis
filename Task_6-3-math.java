/*
Реализовать фуецию, которая принимает на вход два числа n и m и возвращает n^m
Реализовать перегрузку для разных типов данных
*/

// Решение с применением библиотек Math.

public class Main { 

    public static double mult(double a, double b) {
      
      double mult = Math.pow(a,b);
      
      return mult;
    }
    
    public static int mult(int a, int b) {
      
      int mult = (int)Math.pow(a,b);
      
      return mult;
    }

  
    public static void main(String[] args) {
      
      
      double a = 3.5;
      int b = 3;
      double x = mult(a, b);
      System.out.println(x);
      
      System.out.println(mult(-2, 3));
      

  }
}