import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        String input;

        while (true) {
            System.out.println("\n--- Student Grade Tracker ---");
            System.out.println("1. Enter Grades");
            System.out.println("2. Edit Grades");
            System.out.println("3. View All Grades");
            System.out.println("4. Show Statistics");
            System.out.println("5. Exit");
            
            System.out.print("Choose an option: ");
            input = scanner.next();

            switch (input) {
                case "1":
                    enterGrades(grades, scanner);
                    break;
                case "2":
                    editGrade(grades, scanner);
                    break;
                case "3":
                    viewGrades(grades);
                    break;
                case "4":
                    showStatistics(grades);
                    break;
                case "5":
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Method to enter grades
    public static void enterGrades(ArrayList<Integer> grades, Scanner scanner) {
        System.out.println("Enter student grades (type 'done' when finished):");
        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                int grade = Integer.parseInt(input);
                if (grade >= 0 && grade <= 100) {
                    grades.add(grade);
                } else {
                    System.out.println("Grade must be between 0 and 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid grade or 'done' to finish.");
            }
        }
    }

    // Method to edit a grade
    public static void editGrade(ArrayList<Integer> grades, Scanner scanner) {
        if (grades.isEmpty()) {
            System.out.println("No grades available to edit.");
            return;
        }
        viewGrades(grades);
        System.out.print("Enter the index of the grade to edit (starting from 0): ");
        int index = scanner.nextInt();
        if (index < 0 || index >= grades.size()) {
            System.out.println("Invalid index.");
            return;
        }
        System.out.print("Enter the new grade: ");
        int newGrade = scanner.nextInt();
        if (newGrade >= 0 && newGrade <= 100) {
            grades.set(index, newGrade);
            System.out.println("Grade updated successfully.");
        } else {
            System.out.println("Grade must be between 0 and 100.");
        }
    }

    // Method to view all grades
    public static void viewGrades(ArrayList<Integer> grades) {
        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
            return;
        }
        System.out.println("Grades entered: " + grades);
    }

    // Method to show statistics (average, highest, lowest, and distribution)
    public static void showStatistics(ArrayList<Integer> grades) {
        if (grades.isEmpty()) {
            System.out.println("No grades available for statistics.");
            return;
        }

        int highest = grades.get(0);
        int lowest = grades.get(0);
        int sum = 0;

        int[] gradeDistribution = new int[5]; // A, B, C, D, F

        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
            sum += grade;

            // Grade distribution: A=90-100, B=80-89, C=70-79, D=60-69, F=below 60
            if (grade >= 90) {
                gradeDistribution[0]++;
            } else if (grade >= 80) {
                gradeDistribution[1]++;
            } else if (grade >= 70) {
                gradeDistribution[2]++;
            } else if (grade >= 60) {
                gradeDistribution[3]++;
            } else {
                gradeDistribution[4]++;
            }
        }

        double average = (double) sum / grades.size();

        // Display results
        System.out.println("\n--- Grade Statistics ---");
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
        System.out.println("\n--- Grade Distribution ---");
        System.out.println("A (90-100): " + gradeDistribution[0]);
        System.out.println("B (80-89): " + gradeDistribution[1]);
        System.out.println("C (70-79): " + gradeDistribution[2]);
        System.out.println("D (60-69): " + gradeDistribution[3]);
        System.out.println("F (below 60): " + gradeDistribution[4]);

      System.out.println("auther - Vishal Kashyap");
    }
}
