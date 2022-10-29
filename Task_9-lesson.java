import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static void printArray(double[] array) {
      for(int i = 0; i < array.length; i++) {
        System.out.printf("%.2f\t", array[i]);
      }
      System.out.println();
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
    
    // Квадратный корень n-ного элемента массива

    public static void squareRootElement(double[] array, int index) {
      
      System.out.println("==========");
      if (index < array.length) {
        double result = Math.sqrt(array[index]);
        System.out.printf("Квадратный корень %d-ого элемента массива %.4f\n", index, result);
      }
      else
        System.out.println("Вы вышли за границы массива. Такого элемента нет");

    }
    
    // Среднее арифметическое двух элементов массива
    
    public static void arithmeticMeanOfElement(double[] array, int index1, int index2) {
      
      System.out.println("==========");
      if (index1 < array.length && index2 < array.length) {
        double result = (array[index1] + array[index2]) / 2;
        System.out.printf("Среднее арифметическое значение элементов %d и %d равно %.4f\n", index1, index2, result);
      }
      else
        System.out.println("Вы вышли за границы массива. Такого элемента нет");

    }
    
    // Вывод элементов массива, которые имеют неотрицательные значения
    
    public static double[] nonNegativeElements(double[] array) {
      
      System.out.println("==========\nНеотрицательные элементы массива");
      
      int x = 0;
      for(int i = 0; i < array.length; i++) {
        if (array[i] >= x)
          System.out.print(array[i] + " ");
        else
          continue;
      }
      
      return array;
    }
    
    // Вывод элементов массива, значение которых не превышает 100
    
    public static double[] elementsLessThanHundred(double[] array) {
      
      System.out.println("\n==========\nЭлементы массива, значение которых не превышает 100");
      for(int i = 0; i < array.length; i++) {
        if (array[i] <= 100)
          System.out.print(array[i] + " ");
        else
          continue;
      }
      return array;
    }
    
    // Поиск элемента с максимальным значением
    
    public static double findMaxElement(double[] array) {
      
      double max = array[0];
      
      for(int i = 1; i < array.length; i++) {
        if(array[i] > max) {
          max = array[i];
        }
      }
      return max;
    }
    
    // Поиск элемента с минимальным значением
    
    public static double findMinElement(double[] array) {
      
      double min = array[0];
      
      for(int i = 1; i < array.length; i++) {
        if(array[i] < min) {
          min = array[i];
        }
      }
      return min;
    }
    
    // Разница между максимальным и минимальным значением
    
    public static void elementsMinAndMax(double[] array) {
      
      System.out.printf("\n==========\nМинимальное значение элемента массива = %.2f, а масимальное = %.2f\n", findMinElement(array), findMaxElement(array));
    }
    
    public static double compareMinAndMax(double[] array) {
      System.out.println("==========\nPазница между максимальным и минимальным занчением массива составоляет");
      double difference = findMaxElement(array) - findMinElement(array);
      
      return difference;
      
    }
    
    // Поиск индекса элемента с максимальным значением
    
    public static int findIndexOfMaxElement(double[] array) {
      
      int index = 0;
      
      double max = findMaxElement(array);
      
      for(int i = 0; i < array.length; i++) {
        if(array[i] == max) {
          index = i;
          break;
        }
      }

      return index;
    }
    
    // Вывод индекса элемента с максимальным значением
    
    public static void printIndexOfMaxElement(double[] array) {
      
      System.out.printf("==========\nИндекс максимального элемента = %d\n", findIndexOfMaxElement(array));
      
    }
    
    // Поиск индекса элемента с минимальным значением
    
    public static int findIndexOfMinElement(double[] array) {
      
      int index = 0;
      
      double min = findMinElement(array);
      
      for(int i = 0; i < array.length; i++) {
        if(array[i] == min) {
          index = i;
          break;
        }
      }
      return index;
    }
    
    // Вывод индекса элемента с минимальным значением
    
    public static void printIndexOfMinElement(double[] array) {
      
      System.out.printf("==========\nИндекс минимального элемента = %d\n", findIndexOfMinElement(array));
      
    }
    
    // Поменять местами максимальный элемент с выбранным другим
    
    public static double[] swapElements(double[] array, int index) {
      
      if(index >= array.length) {
        return array;
      }
      else {
        double temp = array[index];
        int index1 = findIndexOfMaxElement(array);
        array[index] = array[index1];
        array[index1] = temp;
        
        return array;
      }
    }

    
    public static void main(String[] args) {
      
      double[] array = scanArray(10);
      printArray(array);
      
      // double[] array = generateArray(8);
      // printArray(array);

      
      squareRootElement(array, 5);
      
      arithmeticMeanOfElement(array, 2, 9);
      
      nonNegativeElements(array);
      
      elementsLessThanHundred(array);
      
      elementsMinAndMax(array);
      
      System.out.println(compareMinAndMax(array));
      
      printIndexOfMaxElement(array);
      
      printIndexOfMinElement(array);
      
      swapElements(array, 3);
      printArray(array);
      
  }
}