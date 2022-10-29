/* Лекция №5 Задача 10
Дано натуральное число - n
определить максимальную и минимальную цифру в числе
*/
import java.util.Scanner;
public class Lect5Task10 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите n");
      int n = sc.nextInt();
      sc.close();
      System.out.println("========================================");
      System.out.println("Оригинальное число " + n);
     
      int min = 9;
      int max = 0;
      n = Math.abs(n);
     
      while(n != 0) {
	  	  int last = n % 10;
	  	  
		    if (last < min) {     
			  min = last;
		    }
		    else if (last == 0) {
		      break;
		    }
		    
		    if (last > max) {     
		  	max = last;
		    }
		    else if (last == 9) {
		      break;
		    }
		    n /= 10;
      }
  System.out.println("Максимальная цифра в числе n - " + max);
	System.out.println("Минимальная цифра в числе n - " + min);
  }
}