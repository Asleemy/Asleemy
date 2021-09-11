import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        int grade = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Grade: ");
        grade = input.nextInt();
        if (grade >= 50 ) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}