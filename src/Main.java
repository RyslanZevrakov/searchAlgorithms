import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите метод поиска (линейный или KMP):");
        String method = sc.nextLine();

        System.out.println("Введите целевое значение");
        int target = sc.nextInt();
    }
}