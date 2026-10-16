//Дано число. Проверьте, отрицательное оно или нет. Выведите об этом информацию в консоль
import java.util.Scanner;
public class MinusOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Положительное");
        }
    }
}
