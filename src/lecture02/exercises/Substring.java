package lecture02.exercises;

public class Substring {
    public static void main(String[] args) {
        String str = "Matterhorn";

        String firstPart = str.substring(0,6);
        String secondPart = str.substring(6);

        String newStr = secondPart + firstPart;
        System.out.println(newStr);

        String anotherStr = firstPart + secondPart;
        System.out.println(anotherStr==str);
    }
}
