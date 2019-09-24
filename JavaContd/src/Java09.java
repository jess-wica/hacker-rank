import java.util.Scanner;

public class Java09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        while (sc.hasNextLine()) {
            System.out.println(x++ + " " + sc.nextLine());
        }
    }
}
