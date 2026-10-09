package TelecomBillingSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("       TELECOM BILLING SYSTEM");
        System.out.println("========================================");

        System.out.println("\n1. Mobile Subscriber");
        System.out.println("2. LandLine Subscriber");

        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {

            // Mobile Subscriber Input
            System.out.println("\n----- MOBILE SUBSCRIBER DETAILS -----");

            System.out.print("Enter Subscriber Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Subscriber ID: ");
            long id = sc.nextLong();

            System.out.print("Enter Phone Number: ");
            long phone = sc.nextLong();
            sc.nextLine();

            System.out.print("Enter Plan Name: ");
            String plan = sc.nextLine();

            System.out.print("Enter Free Call Minutes: ");
            int freeCalls = sc.nextInt();

            System.out.print("Enter Package Cost: ");
            double packageCost = sc.nextDouble();

            System.out.print("Enter Extra Call Minutes: ");
            int extraMinutes = sc.nextInt();

            System.out.print("Enter Extra Call Cost Per Minute: ");
            double extraCost = sc.nextDouble();

            System.out.print("Enter Roaming Minutes: ");
            int roamingMinutes = sc.nextInt();

            System.out.print("Enter Roaming Cost Per Minute: ");
            double roamingCost = sc.nextDouble();

            // Create Mobile Subscriber
            MobileSubscriber mobile = new MobileSubscriber(
                    name,
                    id,
                    phone,
                    plan,
                    freeCalls,
                    packageCost,
                    extraMinutes,
                    extraCost,
                    roamingMinutes,
                    roamingCost
            );

            // Display details and bill
            mobile.getSubscriberDetails();
            mobile.calculateBill();

        } else if (choice == 2) {

            // LandLine Subscriber Input
            System.out.println("\n----- LANDLINE SUBSCRIBER DETAILS -----");

            System.out.print("Enter Subscriber Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Subscriber ID: ");
            long id = sc.nextLong();

            System.out.print("Enter Phone Number: ");
            long phone = sc.nextLong();
            sc.nextLine();

            System.out.print("Enter Plan Name: ");
            String plan = sc.nextLine();

            System.out.print("Enter Free Call Minutes: ");
            int freeCalls = sc.nextInt();

            System.out.print("Enter Package Cost: ");
            double packageCost = sc.nextDouble();

            System.out.print("Enter Extra Call Minutes: ");
            int extraMinutes = sc.nextInt();

            System.out.print("Enter Extra Call Cost Per Minute: ");
            double extraCost = sc.nextDouble();

            System.out.print("Enter STD Call Minutes: ");
            int stdMinutes = sc.nextInt();

            System.out.print("Enter STD Cost Per Minute: ");
            double stdCost = sc.nextDouble();

            // Create LandLine Subscriber
            LandLineSubscriber landline = new LandLineSubscriber(
                    name,
                    id,
                    phone,
                    plan,
                    freeCalls,
                    packageCost,
                    extraMinutes,
                    extraCost,
                    stdMinutes,
                    stdCost
            );

            // Display details and bill
            landline.getSubscriberDetails();
            landline.calculateBill();

        } else {

            System.out.println("\nInvalid choice!");
            System.out.println("Please select either 1 or 2.");
        }

        sc.close();

        System.out.println("\n========================================");
        System.out.println("       BILL GENERATION COMPLETED");
        System.out.println("========================================");
    }
}