import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int myInt;
        double myDouble;
        String myString;

        Scanner scanner = new Scanner(System.in);
        myInt = scanner.nextInt();
        System.out.println("Int: " + myInt);

        myDouble = scanner.nextDouble();
        System.out.println("Double: " + myDouble);

        scanner.nextLine();
        myString = scanner.nextLine();
        System.out.println("String: " + myString);
    }
}
