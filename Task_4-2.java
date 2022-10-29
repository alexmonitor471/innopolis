/* Даны радиус круга и сторона квадрата. У какой фигуры площадь больше? */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите длину стороны квадрата: ");
        double L = scan.nextDouble();

        System.out.println("Введите длину радиуса круга: ");
        double C = scan.nextDouble();

        double result1 = (Math.PI)*(Math.pow(C,2));
        double result2 = L*L;

        System.out.printf("Площадь круга равна %.2f\n", result1);

        System.out.printf("Площадь квадрата равна %.2f\n", result2);

        if(result1 < result2) {
            System.out.println("Площадь круга меньше площади квадрата");
        }
        else
            if(result1 > result2) {
            System.out.println("Площадь круга больше квадрата");
            }
            else {
            System.out.println("Площади фигур равны");
            }

    }
}