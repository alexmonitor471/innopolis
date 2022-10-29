/*
Реализовать функцию нахождения минимума:
1.Из трёх чисел
2.Из четырёх чисел
*/


import java.util.*;

  1-ый способ нахождение наименьшего из трёх чисел 

  public class Main {

  public static double min (double a, double b, double c){
    if ((a<=b) && (b<=c))
      return a;
      else if ((b<=a) && (a<=c))
      return b;
    else
      return c;
  }
  public static void main(String[] args) {
      System.out.println(min(-2.6,3.1,-8.8));
  }
}

  2-ой способ нахождение наименьшего из трёх чисел

public class Main {
  
  public static double min (double a, double b){
    if (a<=b)
      return a;
    else
      return b;
}
  public static double min (double a, double b, double c){
    return min(min(a,b),c);
  }     
  public static void main(String[] args) {
     
      System.out.println(min(-2.6,3.1,24.5));
      double x = 200 + min(2, 4, 1);
      System.out.println(x);
  }
}

  Нахождение наименьшего из четырёх чисел

public class Main {
  
  public static double min (double a, double b){
    if (a<=b)
    return a;
    else
    return b;
}
  public static double min (double a, double b, double c,double d){
    return min(min(a,b),min(c,d));
  }     
  public static void main(String[] args) {
     
      System.out.println(min(-2.6,3.1,24.5,-8.8));
  }
}  