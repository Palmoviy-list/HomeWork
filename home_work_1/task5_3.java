package home_work_1;

import java.util.Scanner;

public class task5_3 {
    public static void main(String[] args) {
        System.out.println("Привет, как тебя зовут?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        switch (name) {
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
                break;
        }
    }
}
