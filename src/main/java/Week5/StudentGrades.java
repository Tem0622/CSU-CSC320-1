package Week5;

public class StudentGrades {
    public static void main(String[] args) {
        // Create an array to store grades of 5 students
        int[] grades = new int[5];

        // Assign grades to the array
        grades[0] = 85;
        grades[1] = 90;
        grades[2] = 78;
        grades[3] = 92;
        grades[4] = 88;

        // Find the highest grade
        int maxGrade = grades[0];
        for (int grade : grades) {
            if (grade > maxGrade) {
                maxGrade = grade;
            }
        }

        // Calculate the scaling factor
        double scalingFactor = 100.0 / maxGrade;

        // Apply the scaling factor to all grades
        double[] scaledGrades = new double[grades.length];
        for (int i = 0; i < grades.length; i++) {
            scaledGrades[i] = grades[i] * scalingFactor;
        }

        // Print the original and scaled grades
        System.out.println("Original Grades:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + grades[i]);
        }

        System.out.println("\nScaled Grades:");
        for (int i = 0; i < scaledGrades.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + scaledGrades[i]);
        }
    }
}
