import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Only numbers greater than 1 or less than 100");
        n = scanner.nextInt();

        //Check if even
        if (n % 2 == 0) {
            if (n >= 2 && n <= 5) {
                System.out.println("Not weird");
            } else if (n >= 6 && n <= 20){
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not weird");
            }
            //Result for odd
        } else {
            System.out.println("Weird");
        }
    }
}
