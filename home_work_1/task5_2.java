package home_work_1;

import java.util.Scanner;
import java.util.Objects;

public class task5_2 {
    public static void main(String[] args) {
        System.out.println("Привет, как тебя зовут?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        if (Objects.equals(name, "Анастасия") || Objects.equals(name, "Настя")) {
            System.out.println("Я тебя так долго ждал");
        } else if (Objects.equals(name, "Вася") || Objects.equals(name, "Василий")) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
