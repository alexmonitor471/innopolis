import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите двузначное число: ");
        int a = scan.nextInt();  // Вывод числа //

        int result11 = a/10; // Количество десятков //
        int result22 = a%10; // Количество единиц //
        int result33 = result11 + result22; // Сумма цифр //
        int result44 = result11 * result22; // Произведение цифр //

        System.out.println(result11);
        System.out.println(result22);
        System.out.println(result33);
        System.out.println(result44);
        System.out.println("Число " + a + " содержит " + result11 + " десятка и " + result22 + " единиц. Сумма цифр числа равна " + result33 + " , а произведение цифр этого числа равно " + result44 );

    }
}
