package assignment.billCulculate;
import java.util.Scanner;

public class ClassAttendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int numDays = 30;
        int[] attendance = new int[numDays];
        int totalStudents;
        int days = 0;
        char choice;

        // Entering the total number of students
        System.out.print("====WELCOME DEAR CLASS REPRESENTATIVE ! ====\nYou are required to fill this. \n");
        System.out.print("Enter total number of students in the class: ");
        totalStudents = sc.nextInt();

        // Recording student
        do {
            System.out.print("Enter number of students present on Day " + (days + 1) + ": ");
            attendance[days] = sc.nextInt();
            days++;

            if (days >= numDays) {
                System.out.println("Maximum of " + numDays + " days reached.");
                break;
            }

            System.out.print("Do you want to enter attendance for another day? (y/n): ");
            choice = sc.next().charAt(0);

        } while ((choice == 'y' || choice == 'Y') && days < numDays);

        // Processing and displaying summary of attendance
        int sum = 0, lowDays = 0;
        System.out.println("\n===Attendance Summary===");
        System.out.printf("%-10s %-20s\n", "Day", "Students Present");
        System.out.println("--------------------------------");

        for (int i = 0; i < days; i++) {
            System.out.printf("%-10d %-20d", (i + 1), attendance[i]);
            if (attendance[i] < totalStudents / 2) {
                System.out.print("  <-- Low Attendance");
                lowDays++;
            }
            System.out.println();
            sum += attendance[i];
        }

        double average = (double) sum / days;
        double lowPercentage = ((double) lowDays / days) * 100;

        System.out.println("\nAverage Attendance: " + average);
        System.out.println("Days with <50% attendance: " + lowDays + " (" + lowPercentage + "%)");
        System.out.println("----------------------------------------------------------");
        System.out.println("Class representative signature............xxxxxx");
        

        sc.close();
    }
}
