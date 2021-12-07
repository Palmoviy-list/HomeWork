package home_work_1;

import java.util.Scanner;
import java.util.Objects;

public class task5_1 {
    public static void main(String[] args) {
        System.out.println("Привет, как тебя зовут?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        if (Objects.equals(name, "Анастасия")){
            System.out.println("Я тебя так долго ждал");
            return;
        }
        if (Objects.equals(name, "Вася")){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
            return;
        }
        if (!(Objects.equals(name,"Вася")) || (Objects.equals(name, "Анастасия"))) {
            System.out.println("Добрый день, а вы кто?");
            return;
        }
    }
    /*
    До внимательного прочтения задания был такой варинат решения:

    public static void main(String[] args) {
        System.out.println("Привет, как тебя зовут?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        if (name.equals("Анастасия")){
            System.out.println("Я тебя так долго ждал");
            return;
        }
        if (name.equals("Вася")){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
            return;
        }
        if (!(name.equals("Вася")) || (name.equals("Анастасия"))) {
            System.out.println("Добрый день, а вы кто?");
            return;
        }
    }
     */
}
