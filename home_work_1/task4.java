package home_work_1;

public class task4 {
    public static void main(String[] args) {
        boolean weekday = false;
        boolean vacation = false;

        System.out.println(sleepIn(weekday, vacation));
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday != true || vacation == true) {
            return true;
        } else {
            return false;
        }
    }
}
