package CRUDStudent_using_FILE;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Operation {

    Scanner sc = new Scanner(System.in);
    Operation_In_File oif = new Operation_In_File();

    public void AddStudentDetail() throws IOException {

        String name,gender;
        int ID;
        System.out.println("");
        System.out.println("Please enter the Student name ");
        name = sc.next();
        System.out.println("Please enter the Student gender ");
        gender = sc.next();
        System.out.println("Please enter the Student ID");
        ID = sc.nextInt();


        Student st = new Student(ID, name, gender);
        oif.add(st);
        System.out.println(st);
        System.out.println("");
    }
    public void SortStudent() throws IOException {
        System.out.println("");
        System.out.println("The list of the Student are -----");
        System.out.println("");
        ArrayList<Student> studentList = new ArrayList<>();
        studentList = oif.read();
        Collections.sort(studentList);

        for (Student item : studentList) {

            System.out.println("");
            System.out.println(
                    "ID: " + item.getId() + " Name: " + item.getName() + " Gender: " + item.getGender());
            System.out.println("");
        }
        System.out.println("");

    }

    public void ViewAllStudentDetail() throws IOException {
        System.out.println("");
        System.out.println("The list of the Student are -----");
        System.out.println("");
        ArrayList<Student> studentList = new ArrayList<>();
        studentList = oif.read();

        for (Student item : studentList) {

            System.out.println("");
            System.out.println(
                    "ID: " + item.getId() + " Name: " + item.getName() + " Gender: " + item.getGender());
            System.out.println("");
        }
        System.out.println("");

    }

    public void UpdateStudentDetail() throws IOException {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        int id;
        String name,gender;

        System.out.println("");
        System.out.println("What is the id of that Student which you want to edit -----");
        System.out.println("");
        id = sc.nextInt();

        if (oif.search(id)) {
            System.out.println("Student not found with this id--------");
            System.out.println("");
        } else {
            System.out.println("Edit the name of the Student--------");
            System.out.println("");
            name = sc1.nextLine();
            System.out.println("Edit the gender of the Student--------");
            System.out.println("");
            gender = sc1.nextLine();

            Student st = new Student(id, name, gender);

            st.setId(id);
            st.setName(name);
            st.setGender(gender);

            oif.update(st);
        }
    }

    public void DeleteStudentDetail() throws IOException {
        Scanner sc = new Scanner(System.in);
        int id;
        System.out.println("");
        System.out.println("Enter the id which Student you want to delete ");
        System.out.println("");
        id = sc.nextInt();
        if (oif.search(id)) {
            System.out.println("Student not found with this id");
            System.out.println("");
        }

        else {
            oif.delete(id);
            System.out.println("Student whose id "+ id + " is deleted");

        }
    }
}