package home_work_1;

public class task1_23_4 {
    public static void main(String[] args) {
        int a = 42; //00101010
        int b = 15; //00001111

        int c = a << 2; //10101000
        System.out.println("a << 2 = " + c);
        int d = b << 2; //00111100
        System.out.println("b <<= 2 = " + d);

        a <<= 3;
        System.out.println(a); //000101010000
        b <<= 3;
        System.out.println(b); //01111000

        System.out.println();

        int e = -42; //1111 1111 1111 1111 1111 1111 1101 0110
        int f = -15; //1111 1111 1111 1111 1111 1111 1111 0001

        int g = e << 1; //1111 1111 1111 1111 1111 1111 1010 1100
        System.out.println("e << 1 = " + g);
        int h = f << 1; //1111 1111 1111 1111 1111 1111 1110 0010
        System.out.println("f << 1 = " + h);

        e <<= 4; //1111 1111 1111 1111 1111 1101 0110 0000
        System.out.println(e);
        f <<= 4; //1111 1111 1111 1111 1111 1111 0001 0000
        System.out.println(f);
    }
}
