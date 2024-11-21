package lecture04.exercises;

import java.util.Scanner;

public class UserTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the User-name: ");
        String userName = in.nextLine();
        System.out.println("Enter the password: ");
        String password = in.nextLine();
        in.close();

        // Create a user object and set the attributes
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);

        System.out.println("Username: " + user.getUserName());
        System.out.println("Password: " + user.getPassword());
        System.out.println(user.toString());
    }

}
