import java.util.Scanner;
//Дано число. Проверьте, четное оно или нет.
public class IsEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
        scanner.close();
    }
}
