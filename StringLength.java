import java.util.Scanner;
//Дана строка. Выведите в консоль длину этой строки.
public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.nextLine();
        System.out.println(stroka.length());

        scanner.close();
    }
}
