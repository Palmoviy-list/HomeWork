package home_work_1;

public class task1_23_2 {
    public static void main(String[] args) {
        int a = 42; //00101010
        int b = 15; //00001111

        int c = a | b; //00101111
        System.out.println("a | b = " + c);

        a |= b;
        System.out.println(a);

        System.out.println();

        int d = -42; //1111 1111 1111 1111 1111 1111 1101 0110
        int e = -15; //1111 1111 1111 1111 1111 1111 1111 0001

        int f = d | e; //1111 1111 1111 1111 1111 1111 1111 0111
        System.out.println("d | e = " + f);

        d |= e; //1111 1111 1111 1111 1111 1111 1111 0111
        System.out.println(d);
    }
}
