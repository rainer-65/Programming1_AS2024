package lecture01.exercises;

public class Interest {
    public static void main(String[] args) {
        double balance = 1234.50;
        double interest = 0.005;

        balance = balance + balance*interest;
        System.out.println("At the end of year 1, the account balance is " + balance);

        balance = balance + balance*interest;
        System.out.println("At the end of year 2, the account balance is " + balance);

        balance = balance + balance*interest;
        System.out.println("At the end of year 3, the account balance is " + balance);
    }
}
