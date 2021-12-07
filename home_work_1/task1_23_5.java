package home_work_1;

public class task1_23_5 {
    public static void main(String[] args) {
        int a = 42; //00101010
        int b = 15; //00001111

        int c = a >> 1; //00010101
        System.out.println("a >> 1 = " + c);
        int d = b >> 1; //00000111
        System.out.println("b >> 1 = " + d);

        a >>= 4; //00000010
        System.out.println(a);
        b >>= 4; //00000000
        System.out.println(b);

        System.out.println();

        int e = -42; //1111 1111 1111 1111 1111 1111 1101 0110
        int f = -15; //1111 1111 1111 1111 1111 1111 1111 0001

        int g = e >> 2; //1111 1111 1111 1111 1111 1111 1111 0101
        System.out.println("e >> 2 = " + g);
        int h = f >> 2; //1111 1111 1111 1111 1111 1111 1111 1100
        System.out.println("f >> 2 = " + h);

        e >>= 3; //1111 1111 1111 1111 1111 1111 1111 1010
        System.out.println(e);
        f >>= 3; //1111 1111 1111 1111 1111 1111 1111 1110
        System.out.println(f);
    }
}
