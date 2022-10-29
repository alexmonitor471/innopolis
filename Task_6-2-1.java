/* Имеется зарплата сотрудника - натуральное число. Реализовать фунлцию, которая рассчитывает премию сотрудника - вещественное число */

import java.util.*;

public class Main {
    
  public static void salary(double a) {

    if(a >= 8000)
      System.out.printf("Премия составит %.2f, итого месячный доход сотавит %.2f", a*1.1, a+a*1.1);
    else if(a < 4000)
      System.out.printf("Премия составит %.2f, итого месячный доход сотавит %.2f", a*0.5, a+a*0.5);
      else
        System.out.printf("Премия составит %.2f, итого месячный доход сотавит %.2f", a*0.7, a+a*0.7);

  }
    
  public static void main(String[] args) {
      
    salary(10000);
    
  }
}