package MovieTicketBooking;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MovieTicketBooking {

    static final int TOTAL_SEATS = 20;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Store booked seat numbers
        Set<Integer> bookedSeats = new HashSet<>();

        int choice = 0;

        do {
            System.out.println("\n===== MOVIE TICKET BOOKING SYSTEM =====");
            System.out.println("1. Book a Seat");
            System.out.println("2. Cancel a Booking");
            System.out.println("3. Display Booked Seats");
            System.out.println("4. Display Available Seats");
            System.out.println("5. Exit");

            System.out.print("\nEnter your choice: ");

            // Validate menu input
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
                continue;
            }

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Book a seat
                    System.out.print("Enter seat number (1-20): ");

                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid seat number!");
                        sc.nextLine();
                        break;
                    }

                    int bookSeat = sc.nextInt();

                    if (bookSeat < 1 || bookSeat > TOTAL_SEATS) {
                        System.out.println(
                                "Invalid seat number! Choose between 1 and 20.");
                    } else if (bookedSeats.add(bookSeat)) {
                        System.out.println(
                                "Seat " + bookSeat + " booked successfully!");
                    } else {
                        System.out.println(
                                "Seat " + bookSeat + " is already booked!");
                    }
                    break;

                case 2:
                    // Cancel a booking
                    System.out.print("Enter seat number to cancel: ");

                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid seat number!");
                        sc.nextLine();
                        break;
                    }

                    int cancelSeat = sc.nextInt();

                    if (cancelSeat < 1 || cancelSeat > TOTAL_SEATS) {
                        System.out.println(
                                "Invalid seat number! Choose between 1 and 20.");
                    } else if (bookedSeats.remove(cancelSeat)) {
                        System.out.println(
                                "Booking for seat " + cancelSeat
                                + " cancelled successfully!");
                    } else {
                        System.out.println(
                                "Seat " + cancelSeat
                                + " is not booked. No booking exists.");
                    }
                    break;

                case 3:
                    // Display booked seats
                    System.out.println("\n===== BOOKED SEATS =====");

                    if (bookedSeats.isEmpty()) {
                        System.out.println("No seats are currently booked.");
                    } else {
                        System.out.println("Booked seat numbers:");

                        for (Integer seat : bookedSeats) {
                            System.out.println("Seat " + seat);
                        }
                    }
                    break;

                case 4:
                    // Display seat availability
                    int bookedCount = bookedSeats.size();
                    int availableSeats = TOTAL_SEATS - bookedCount;

                    System.out.println("\n===== SEAT AVAILABILITY =====");
                    System.out.println("Total seats     : " + TOTAL_SEATS);
                    System.out.println("Booked seats    : " + bookedCount);
                    System.out.println("Available seats : " + availableSeats);
                    break;

                case 5:
                    System.out.println(
                            "Thank you for using Movie Ticket Booking System!");
                    break;

                default:
                    System.out.println(
                            "Invalid choice! Please select between 1 and 5.");
            }

        } while (choice != 5);

        sc.close();
    }
}