package CRUDStudent_using_FILE;
/* in this project,
 the student information system is to allow the administrator to edit and find out details of a student,
 but all operations happen on the local csv file.
 Used--->
 * Collection ArrayList, Java I/O
 * cvs file(for use in database).*/

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int number;
        Operation op = new Operation();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Welcome to Student Information System (SIS)\n");
            System.out.println("-------------------------------------------");
            System.out.println("Press 1 to add a Student ");
            System.out.println("Press 2 to see all Student ");
            System.out.println("Press 3 to update a Student ");
            System.out.println("Press 4 to delete a Student ");
            System.out.println("Press 5 to sort Student list ");

            number = sc.nextInt();

            if (number == 1) {
                op.AddStudentDetail();
            } else if (number == 2) {
                op.ViewAllStudentDetail();
            } else if (number == 3) {
                op.UpdateStudentDetail();
            } else if (number == 4) {
                op.DeleteStudentDetail();
            }else if (number == 5) {
                op.SortStudent();
            } else {
                System.out.println("Wrong entered");
            }
        } while (number != 100);
    }
}