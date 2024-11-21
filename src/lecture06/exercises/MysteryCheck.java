package lecture06.exercises;

public class MysteryCheck {

    public static void main(String[] args) {

        for (int i=0;  i<=100; i++) {
            System.out.println(mystery(i));
        }

    }

    public static int mystery(int valIn) {
        int result = 0;
        int x = 1;
        while (x <= valIn) {
            int y = 1;
            while (y <= x) {
                result++;
                y++;
            }
            x++;
        }
        return result;
    }


}
