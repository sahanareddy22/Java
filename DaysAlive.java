package daysalive;

import java.util.Scanner;

public class DaysAlive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array: day, month, year
        int[] birth = new int[3];
        int[] today = new int[3];

        System.out.print("Enter birth day: ");
        birth[0] = sc.nextInt();

        System.out.print("Enter birth month: ");
        birth[1] = sc.nextInt();

        System.out.print("Enter birth year: ");
        birth[2] = sc.nextInt();

        System.out.print("Enter today's day: ");
        today[0] = sc.nextInt();

        System.out.print("Enter today's month: ");
        today[1] = sc.nextInt();

        System.out.print("Enter today's year: ");
        today[2] = sc.nextInt();

        int days = 0;

        // Count complete years
        for (int year = birth[2]; year < today[2]; year++) {

            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                days = days + 366;
            } else {
                days = days + 365;
            }
        }

        // Subtract days before birth date
        int[] monthDays = {31, 28, 31, 30, 31, 30,
                           31, 31, 30, 31, 30, 31};

        // Birth year leap year
        if ((birth[2] % 400 == 0) ||
            (birth[2] % 4 == 0 && birth[2] % 100 != 0)) {
            monthDays[1] = 29;
        }

        for (int month = 1; month < birth[1]; month++) {
            days = days - monthDays[month - 1];
        }

        days = days - birth[0];

        // Add days of current year
        monthDays[1] = 28;

        if ((today[2] % 400 == 0) ||
            (today[2] % 4 == 0 && today[2] % 100 != 0)) {
            monthDays[1] = 29;
        }

        for (int month = 1; month < today[1]; month++) {
            days = days + monthDays[month - 1];
        }

        days = days + today[0];

        System.out.println("Number of days alive = " + days);

        sc.close();
    }
}