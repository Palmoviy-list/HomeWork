package home_work_1;

public class task1_23_6 {
    public static void main(String[] args) {
        int a = 42; //0010 1010
        int b = 15; //0000 1111

        int c = a >>> 2; //0000 1010
        System.out.println("a >>> 2 = " + c);
        int d = b >>> 2; //000 00011
        System.out.println( "b  >>> 2 = "+ d);

        a >>>= 1; //0001 0101
        System.out.println(a);
        b >>>= 1; //0000 0111
        System.out.println(b);

        System.out.println();

        int e = -42; //1111 1111 1111 1111 1111 1111 1101 0110
        int f = -15; //1111 1111 1111 1111 1111 1111 1111 0001

        int g = e >>> 2;
        System.out.println("e >>> 2 = " + g);
        int h = f >>> 2;
        System.out.println( "f  >>> 2 = "+ h);

        e >>>= 1;
        System.out.println(a);
        f >>>= 1;
        System.out.println(b);
    }
}
