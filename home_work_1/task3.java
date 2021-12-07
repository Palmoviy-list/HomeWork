package home_work_1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи, пожалуйста, число : ");
        int number = in.nextInt();

        double result = Math.sqrt(number);

        if (result == (int)result){
            System.out.println("Квадратный корень от числа " + number + " = " + result);
        }
        else {
            System.out.println("Нельзя вынести данное число из-под квадратного корня");
            System.out.println("Ближайшее число, которое можно вынести из-под корня = " + Math.round(result) * Math.round(result));
        }
    }
}
