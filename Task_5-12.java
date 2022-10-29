/*
Гражданин  1 марта открыл счет в банке, вложив  1000 руб. Через каждый месяц размер вклада увеличивается на 2% от 
имеющейся суммы. Определить:
1.за какой месяц величина ежемесячного увеличения вклада превысит 30 руб.;
2.через сколько месяцев размер вклада превысит 1200 руб.
*/


public class Main {
    public static void main(String[] args) {

        int contOfMont = 0;   
      
      for(double i = 1000; ; i=i+i*0.02) {

          System.out.printf("%.2f \n", i);
          contOfMont++;
          
          if (i > 1200) 
           break;
        }
        System.out.print(contOfMont-1);
  }
}