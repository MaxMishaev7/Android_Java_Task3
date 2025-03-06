import java.util.Scanner;

public class Main {

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? true : false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean end = false;
        int count = 0;
        while (!end) {
            System.out.print("Введите год в формате 'yyyy': ");
            int year = scan.nextInt();

            System.out.print("Введите количество дней: ");
            int daysInYear = scan.nextInt();

            if (year < 0) {
                System.out.println("Год не может быть отрицательным");
                break;
            }
            if (daysInYear != 365 && daysInYear != 366) {
                System.out.println("В году нет такого количества дней");
                break;
            }

            if (isLeapYear(year) && daysInYear == 366 || !(isLeapYear(year)) && daysInYear == 365) {
                count += 1;
            } else {
                System.out.println("Неправильно! В этом году " + (isLeapYear(year) ? 366 : 365) + " дней.");
                break;
            }
        }
        scan.close();
        System.out.println("Набрано очков: " + count);
    }
}