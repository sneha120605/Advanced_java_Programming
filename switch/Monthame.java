import java.util.Scanner;

public class Monthame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number → ");
        int month = sc.nextInt();

        String monthName = switch (month) {
            case 1 -> {
                yield "January";
            }
            case 2 -> {
                yield "February";
            }
            case 3 -> {
                yield "March";
            }
            case 4 -> {
                yield "April";
            }
            case 5 -> {
                yield "May";
            }
            case 6 -> {
                yield "June";
            }
            case 7 -> {
                yield "July";
            }
            case 8 -> {
                yield "August";
            }
            case 9 -> {
                yield "September";
            }
            case 10 -> {
                yield "October";
            }
            case 11 -> {
                yield "November";
            }
            case 12 -> {
                yield "December";
            }
            default -> {
                yield "Invalid month number";
            }
        };

        System.out.println("Output → " + monthName);
    }
}