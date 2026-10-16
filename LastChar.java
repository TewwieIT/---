import java.util.Scanner;
//Дана строка. Выведите в консоль последний символ строки.
public class LastChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.nextLine();
        int dlinaStroki = stroka.length();
        System.out.println(stroka.charAt(dlinaStroki - 1));
    }
}
