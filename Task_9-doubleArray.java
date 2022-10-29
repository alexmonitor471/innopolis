import java.util.*;
import java.util.Scanner;

public class Main {

    public static void printArray(double [][] array) {  
      for(int i = 0; i < array.length; i++) {
        for(int j = 0; j < array[i].length; j++) {
          System.out.printf("%.1f\t", array[i][j]);
        }
        System.out.println();  
      }
    }
    
    public static double[][] scanArray(int n, int m) {

        Scanner in = new Scanner(System.in);
        double[][] array = new double[n][m];
 
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = in.nextDouble();
            }
        }
        return array;
    }
    
    // Сумма элементов третей строки
    public static void sumOfElementsThirdRow(double [][] array) {  

        double sum = 0;
        for(int i = 2; i < 3; i++) {
          for(int j = 0; j < array.length; j++) {
            sum = sum + array [i][j];
 
          }
        }
      System.out.printf("=======\nСумма элементов третей строки\n%.1f\n", sum);
    }
    // Сумма элементов второго столбца
    public static void sumOfElementsSecondColumn(double [][] array) {  

        double sum = 0;
        for(int i = 0; i < array.length; i++) {
          for(int j = 1; j < 2; j++) {
            sum += array [i][j];
 
          }
        }
      System.out.printf("=======\nСумма элементов второго столбца\n%.1f\n", sum);
    }
    // Меняем местами строки
    public static double[][] swapLines(double [][] array, int x, int y) {
      System.out.println("=======\nМеняем строки местами");
        double[] temp = array[x];
        array[x] = array[y];
        array[y] = temp;
        
        return array;
      
    }
  
    public static void main(String[] args) {
      
      double [][] array = scanArray(5, 5);
      printArray(array);
      
      // Выводим элемент расположенный в правом верхнем углу
      System.out.printf("=======\nПравый верхний элемент\n%.1f\n", array [0][array.length-1]);
      // Выводим элемент расположенный в левом нижнем углу
      System.out.printf("=======\nЛевый нижний элемент\n%.1f\n", array [array.length-1][0]);
      
      sumOfElementsSecondColumn(array);
      sumOfElementsThirdRow(array);
      swapLines(array, 2, 4);
      printArray(array);
      
    }  
}