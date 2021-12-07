package home_work_1;

public class task1_23_3 {
    public static void main(String[] args) {
        int a = 42; //00101010
        int b = 15; //00001111

        int c = a ^ b; //00100101
        System.out.println("a ^ b = " + c);

        System.out.println("Now we will swap the values of the variables");
        a = a ^ b; //00100101
        b = a ^ b; //00101010
        System.out.println("b = " + b);
        a = a ^ b; //00001111
        System.out.println("a = " + a);

        b ^= a; //00100101
        System.out.println(b);

        System.out.println();

        int d = -42; //1111 1111 1111 1111 1111 1111 1101 0110
        int e = -15; //1111 1111 1111 1111 1111 1111 1111 0001

        int f = d ^ e; //00100111
        System.out.println("d ^ e = " + f);

        System.out.println("Now we will swap the values of the variables");
        d = d ^ e; //00100111
        e = d ^ e; //1111 1111 1111 1111 1111 1111 1101 0110
        System.out.println("e = " + e);
        d = d ^ e; //1111 1111 1111 1111 1111 1111 1111 0001
        System.out.println("d = " + d);

        d ^= e; //00100111
        System.out.println(d);
    }
}