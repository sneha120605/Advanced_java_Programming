import java.util.Scanner;

public class DayType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number → ");
        int day = sc.nextInt();

        String result = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day number";
        };

        System.out.println("Output → " + result);
    }
}