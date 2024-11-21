package lecture03.examples;

public class MethodExample {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;

        int result = multiply3Int(a, b, c, d);
        System.out.println(result);

        int result2 = multiply3Int(d, c, b, a);
        System.out.println(result2);

        int result3 = multiply3Int(1, 2, 3, 4);
        System.out.println(result3);
    }

    static int multiply3Int(int x, int y, int z, int w) {
        return x * y * z + w;
    }
}
