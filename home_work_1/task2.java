package home_work_1;

public class task2 {
    public static void main(String[] args) {
        /*
        5 + 2 / 8   (2 / 8 = 0 --> 5 + 0 = 5)
	    (5 + 2) / 8    (5 + 2 = 7 --> 7 / 8 = 0)
	    (5 + 2++) / 8   (5 + 2 = 7 --> 7 / 8 = 0)
	    (5 + 2++) / --8 (5 + 2 = 7 --> --8 = 7 --> 7 / 7 = 1)
	    (5 * 2 >> 2++) / --8 (5 * 2 = 10 --> 10 >> 2 = 2 --> 2 / 7 = 0)
	    (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8 (68 / 22 = 3 --> 3 * 2 = 6 --> 5 + 7 = 12 --> 12 < 20 --> 6 >> 2 = 1 --> 1 / 8 = 0)
	    (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8
	     6 - 2 > 3 && 12 * 12 <= 119 (6 - 2 = 4 --> 4 > 3 (true) --> 12 * 12 = 144 --> 144 > 119 (false) --> false)
	    true && false (false, т.к. с логическим оператором && будет true если только обе части выражения верны)
         */
        int a = 5;
        int b = 2;
        int c = 8;

        int answer1 = a + b / c;
        System.out.println(answer1);

        int answer2 = ( a + b ) / c;
        System.out.println(answer2);

        int answer3 = ( a + b++ ) / c;
        System.out.println(answer3);

        int answer4 = ( a + b++ ) / --c;
        System.out.println(answer4);

        int answer5 = (a * b >> b++) / --c;
        System.out.println(answer5);

        int answer6 = (a + 7 > 20 ? 68 : 22 * 2 >> b++) / --c;
        System.out.println(answer6);

        /*
        int answer7 = (a + 7 > 20 ? 68 >= 68 : 22 * 2 >> b++) / --c;
        System.out.println(answer7);
        */

        boolean answer8 = 6 - 2 > 3 && 12 * 12 <= 119;
        System.out.println(answer8);

        boolean answer9 = true && false;
        System.out.println(answer9);
    }
}
