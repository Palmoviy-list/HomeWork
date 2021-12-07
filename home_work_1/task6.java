package home_work_1;

public class task6 {
    public static void main(String[] args) {
        int[] number = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 8, 9};
        System.out.println(createPhoneNumber(number));
    }
    public static String createPhoneNumber(int[] number) {
        String newNumber = "(" + number[0] + number [1] + number[2] + ") " + number[3] + number[4] + number[5] + "-" + number[6] + number[7] + number[8] + number[9];
        System.out.println("Correct number format");
        return newNumber;
    }
}
