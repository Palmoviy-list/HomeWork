package home_work_1;

public class task1_23_1 {
    public static void main(String[] args) {
        int a = 42; //00101010
        int b = 15; //00001111

        int c = a & b; //00001010
        System.out.println("a & b = " + c);

        a &= b; //00001010
        System.out.println(a);

        System.out.println();

        int d = -42; //1111 1111 1111 1111 1111 1111 1101 0110
        int e = -15; //1111 1111 1111 1111 1111 1111 1111 0001

        int f = d & e; //1111 1111 1111 1111 1111 1111 1101 0000
        System.out.println("d & f = " + f);

        d &= e; //1111 1111 1111 1111 1111 1111 1101 0000
        System.out.println(d);
    }
}
