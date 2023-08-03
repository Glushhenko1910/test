import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < b) {
            System.out.println("Еще не позвоним");
        } else if (a == b) {
            System.out.println("Звоним");
        } else if (a > b) {
            System.out.println("Проспали");
        }
    }
}