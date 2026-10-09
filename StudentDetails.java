package StudentDetails;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Store AFid as the key and student details as the value
        Map<String, HashMap<String, String>> students = new HashMap<>();

        String choice = "yes";

        do {
            System.out.println("\n==================================");
            System.out.println("       STUDENT REGISTRATION");
            System.out.println("==================================");

            // Enter AFid
            System.out.print("Enter AFid : ");
            String afid = sc.nextLine().trim();

            // Validate AFid
            if (!afid.startsWith("AF")) {
                System.out.println("Invalid AFid! It must start with AF.");
                System.out.println("Example: AF101");
                continue;
            }

            // Check for duplicate AFid
            if (students.containsKey(afid)) {
                System.out.println("This AFid already exists!");
                System.out.println("Please enter a different AFid.");
                continue;
            }

            // Enter email
            System.out.print("Enter Email: ");
            String email = sc.nextLine().trim();

            // Validate email
            if (email.isEmpty() || !email.contains("@")
                    || !email.contains(".")) {
                System.out.println("Invalid email address. Please try again.");
                continue;
            }

            // Display course options
            System.out.println("\nAvailable Courses:");
            System.out.println("------------------------------");
            System.out.println("1. Java");
            System.out.println("2. Python");
            System.out.println("3. Artificial Intelligence (AI)");
            System.out.println("------------------------------");

            System.out.print("Select your course (1-3): ");
            String courseChoice = sc.nextLine().trim();

            String course;

            // Select course
            switch (courseChoice) {
                case "1":
                    course = "Java";
                    break;

                case "2":
                    course = "Python";
                    break;

                case "3":
                    course = "AI";
                    break;

                default:
                    System.out.println("Invalid course selection!");
                    System.out.println("Please register again.");
                    continue;
            }

            // Store student details in an inner HashMap
            HashMap<String, String> details = new HashMap<>();

            details.put("Email", email);
            details.put("Course", course);

            // Store AFid and associated details in the outer Map
            students.put(afid, details);

            System.out.println("\nStudent registered successfully!");
            System.out.println("AFid   : " + afid);
            System.out.println("Email  : " + email);
            System.out.println("Course : " + course);

            // Ask whether to register another student
            System.out.print("\nDo you want to add another student? (yes/no): ");
            choice = sc.nextLine().trim();

        } while (choice.equalsIgnoreCase("yes"));

        // Display all student details
        System.out.println("\n");
        System.out.println("==============================================================");
        System.out.println("                    STUDENT DETAILS");
        System.out.println("==============================================================");

        System.out.printf("%-15s %-30s %-15s%n",
                "AFid", "Email", "Course");

        System.out.println("--------------------------------------------------------------");

        if (students.isEmpty()) {
            System.out.println("No student records found.");
        } else {
            for (Map.Entry<String, HashMap<String, String>> entry
                    : students.entrySet()) {

                String afid = entry.getKey();

                HashMap<String, String> details = entry.getValue();

                String email = details.get("Email");
                String course = details.get("Course");

                System.out.printf("%-15s %-30s %-15s%n",
                        afid, email, course);
            }
        }

        System.out.println("==============================================================");
        System.out.println("Total Students Registered: " + students.size());
        System.out.println("Thank you!");

        sc.close();
    }
}