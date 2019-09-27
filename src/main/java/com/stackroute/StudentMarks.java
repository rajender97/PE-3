import java.io.IOException;
import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of students");
        int numOfStudents = scan.nextInt();
        int[] stuGrades = new int[numOfStudents];
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter the grade of "+(i+1)+" student");
            stuGrades[i] = scan.nextInt();
            if ((stuGrades[i] >= 0) && (stuGrades[i] <= 100)) continue;
            else {
                throw new IOException(" invalid grade");
            }
        }
        for (int i=0;i<numOfStudents;i++){
            System.out.println("the grade of "+(i+1)+" student is: "+stuGrades[i]);
        }
    }
}