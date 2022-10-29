import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число: ");
        int total = scan.nextInt();  // Количество дней //

        int maxsem = 7; // Макимальное количество дней в неделе //
        int maxmes = 31; // Макимальное количество дней в месяце //
        int any = 366; // максимальное количество дней в году //
        float media = any / 12; // Среднее количество дне в месяце //
        int result1 = (total - maxsem - 1)/maxsem; // Результат, если начало отсчета попадает на 2-й день недели //
        int result2 = (total)/maxsem; // Результат, если начало отсчета попадает на 1-й день недели //
        float result3 = (total - maxmes - 1)/media; // Результат, если начало отсчета попадает на 2-й день месяца //\
        int result5 = (int)result3;
        float result4 = (total)/media; // Результат, если начало отсчета попадает на 1-й день месяца //
        int result6 = (int)result4;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println("В " + total + " днях может быть " + result1 + " или " + result2 + " недель, зависит от дня месяца, с которого ведется отсчет");
        System.out.println(result3);
        System.out.println(result4);
        System.out.println("В " + total + " днях может быть " + result5 + " или " + result6 + " месяцев, зависит от дня месяца, с которого ведется отсчет");
    }
}
