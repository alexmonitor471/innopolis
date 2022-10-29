import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Lect9Self {
    
    public static void printArray (double [] array) {	//Печать массива
      for (int i = 0; i < array.length; i++) {
        System.out.printf("%.2f\t", array[i]);
      }
      System.out.println();
    }
    
    public static void printArrayReverse (double [] array) { 	//Печать в обратном порядке 
      for (int i = array.length - 1; i >= 0 ; i--) {
        System.out.printf("%.2f\t", array[i]);
      }
      System.out.println();
    }
    
    public static double [] generateArray (int n) { // генерация массива в диапазоне значений от -100 до +100
      double [] array = new double [n];
      Random r = new Random();
      for (int i = 0; i < n; i++) {
        array[i] = (((r.nextInt(1000) % 2) == 0) ? r.nextInt(100) : -1 * r.nextInt(100)); // -100 .. 100
      }
      return array;
    }
    
    public static double findMinElement(double[] array) {	//поиск минимального значения
      double min = array[0];
      for (int i = 1; i < array.length; i++) {
        if(array[i] < min) {
          min = array[i];
        }
      }
      return min;
    }
    
    public static void printArrayPosNeg (double [] array, boolean trigger) {	// печать положительных или отрицательных значений
      for (int i = 0; i < array.length; i++) {
        if ((array[i] < 0) ^ trigger) {
          System.out.printf("%.2f\t", array[i]);
        }
      }
      System.out.println();
    }
    
    public static void main(String[] args) {
      System.out.println("Введите длину массива");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      double sumAll = 0;
      double mult = 1;
      double sumSqr = 0;
      double sumSix = 0;
      double sumPos = 0;
      double sum5 = 0;
      int indexMin = 0;
      
      double[] array = generateArray (n);
      System.out.println("Элементы массива");
      printArray(array);
      System.out.println("Элементы обратного массива");
      printArrayReverse(array);
      
      double min = findMinElement(array);
      for (int i = 0; i < n; i++) {
        sumAll += array[i];
        mult *= array[i];
        sumSqr += array[i] * array[i];
        if (i == 5) {
          sumSix = sumAll;
        }
        if (array[i] > 0) {
          sumPos += array[i];
        }
        if ((array[i] % 5) == 0) {
          sum5 += array[i];
        }
        if (Math.abs (array[i] - min) < 0.001) {
          indexMin = i;
        }
      } 
      
      System.out.printf("Сумма всех элементов массива \t %.2f \n", sumAll);
      System.out.printf("Произведение всех элементов массива \t %.3f \n", mult);
      System.out.printf("Сумма квадратов всех элементов массива \t %.2f \n", sumSqr);
      System.out.printf("Сумма 6 элементов массива \t %.2f \n", sumSix);
      System.out.printf("Сумма всех положительных элементов массива \t %.2f \n", sumPos);
      System.out.printf("Сумма элементов массива кратных 5 \t %.2f \n", sum5);
      System.out.printf("Номер последнего минимального элемента массива \t %d \n", indexMin);
      
      printArrayPosNeg (array, true);
      printArrayPosNeg (array, false);
  }
}
