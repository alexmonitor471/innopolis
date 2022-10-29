import java.util.*;
public class Main {
  
    // Печать массива
    public static void printArray(double[] array) {
      for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + "\t");
      }
      System.out.println();
    }
    
    // Реверсная печать массива
    public static void printArrayReverse(double[] array) {
      for(int i = array.length-1; i >= 0; i--) {
        System.out.print(array[i] + "\t");
      }
      System.out.println();
    }
    
    // Сумма всех элементов массива
    public static void arraySum(double[] array) {
      double sum = 0;
      for (int i = 0; i < array.length; i++) {
      sum += array[i];
      }
      System.out.printf("=======\nСумма элементов массива :\n%.2f\n", sum);
    }
    
    // Произведение всех элементов массива
    public static void arrayMultiplication(double[] array) {
      double multiplication = 1;
      for (int i = 0; i < array.length; i++) {
      multiplication *= array[i];
      }
      System.out.printf("=======\nПроизведение элементов массива :\n%.2f\n", multiplication);
    }
    
    // Сумма квадратов всех элементов массива
    public static void sumOfSquaresOfElements(double[] array) {
      double sum = 0;
      for (int i = 0; i < array.length; i++) {
      sum += Math.pow(array[i], 2);
      }
      System.out.printf("=======\nСумма квадратов элементов массива :\n%.2f\n", sum);
    }
    
    // Сумма первых 6-ти элементов массива
    public static void sumOfSixElements(double[] array) {
      double sum = 0;
      for (int i = 0; i < 5; i++) {
      sum += array[i];
      }
      System.out.printf("=======\nСумма первых 6-ти элементов массива :\n%.2f\n", sum);
    }
      
    // Сумма положительных элементов массива
    public static void sumOfPositiveElements(double[] array) {
      double sum = 0;
      for (int i = 0; i < array.length; i++) {
        if (array[i] >= 0) 
          sum += array[i];
        else
          continue;
      }
      System.out.printf("=======\nСумма положительных элементов массива :\n%.2f\n", sum);
    }
    
    // Сумма всех элементов массива кратных пяти
    public static void sumOfElementsOfMultiplesOfFive(double[] array) {
      double sum = 0;
      for (int i = 0; i < array.length; i++) {
        if (array[i] % 5 == 0)
          sum += array[i];
        else
          continue;
      }
      System.out.printf("=======\nСумма всех элементов массива кратных пяти :\n%.2f\n", sum);
    }
    
    // Найти номер последнего минимального элемента массива
    
    public static void printIndexOfMinElement(double[] array) {
      double min = array[0];     // 1. Ищем минимальное значение
      for(int i = 1; i < array.length; i++) {
        if(array[i] < min) {
          min = array[i];
        }
      }
      int index = 0;    // 2. Поиск индекса последнего элемента с минимальным значением
      for(int i = array.length-1; i >= 0; i--) {
        if(array[i] == min) {
          index = i;
          break;
      }
    }   
    System.out.printf("==========\nИндекс последнего элемента с минимальным значением = %d\n", index);
    }
    
    // Вывод сначала неотрицательных чисел потом отрицательных
    public static void printOfPositiveNegativeElements(double[] array) {
      System.out.println("=======\nВывод сначала неотрицательных значений потом отрицательных");
      for(int i = 0; i < array.length; i++) {
        if (array[i] >= 0)
          System.out.print(array[i] + "\t");
      }
      for(int i = 0; i < array.length; i++) {
        if (array[i] < 0)
          System.out.print(array[i] + "\t");
      }
      System.out.println();
    }
    
    // Количество максимальных элементов в массиве
    
    public static void numberOfMaximumElementsInArray(double[] array) {
      double max = array[0];
      for(int i = 1; i < array.length; i++) {
        if(array[i] > max) {
          max = array[i];
        }
      }
      int count = 0;
      for(int i = 0; i < array.length; i++) {
        if(array[i] == max)
          count++;
      }
      System.out.printf("==========\nМаксимальное занчение %.2f встречаетмся в массиве %d раз\n", max, count);
    }
  
    public static double[] scanArray(int n) {
      double[] array = new double[n];
      Scanner sc = new Scanner(System.in);
      for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextDouble();
      }
      return array;
    }
    
    public static double[] generateArray(int n) {
      double[] array = new double[n];
      Random r = new Random();
      for(int i = 0; i < array.length; i++) {
        array[i] = r.nextInt(100); // 0 - 100
      }
      return array;
    }
      
    public static void main(String[] args) {
      double[] array = scanArray(10);
      //double[] array = generateArray(9);
      printArray(array);
      printArrayReverse(array);
      arraySum(array);
      arrayMultiplication(array);
      sumOfSquaresOfElements(array);
      sumOfSixElements(array);
      sumOfPositiveElements(array);
      sumOfElementsOfMultiplesOfFive(array);
      printIndexOfMinElement(array);
      printOfPositiveNegativeElements(array);
      numberOfMaximumElementsInArray(array);
    }
}

