package CRUDStudent_using_CONSOLE;
/* in this project,
 the student information system is to allow the administrator to edit and find out details of a student.
 Used--->
 * Collection HasMap,
 * Java 8 Stream API methods.*/

import java.util.*;


public class StudentSystem {
    public static final Scanner CONSOLE = new Scanner(System.in);


    public static void printStudentList(Map<Integer, String> studentMap) {

        //studentMap.put(10, "Cemal");
        if (studentMap.isEmpty()) {
            System.out.println("list is empty..");
        }

        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {

            System.out.println(" Student No : " + entry.getKey() + ",  Student : " + entry.getValue());

        }


    }

    public static void addStudent(Map<Integer, String> studentMap) {

        System.out.print(" Enter student ID and than name to add  the list\n");

        int id = CONSOLE.nextInt();
        String name = CONSOLE.next();

        studentMap.put(id, name);

        System.out.println("Student Id Number:" + id + ", Student Name :" + name + " has been written. ");


    }

    public static void removeStudent(Map<Integer, String> studentMap) {

        System.out.println(" Enter student ID to remove the list");

        int idNumber = CONSOLE.nextInt();
        studentMap.remove(idNumber);
        System.out.println("Student Id Number:" + idNumber + " has been deleted. ");

    }

    private static void findStudent(Map<Integer, String> studentMap) {
        System.out.println(" Enter student name to check on the list");
        String name = CONSOLE.next();

        if (studentMap.containsValue(name)) {
            System.out.println("Exist");
        } else {
            System.out.println("Not Exist");
        }

    }

    private static void logOut() {
        System.exit(0);
    }


    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();

        System.out.println("Welcome to Student Information System (SIS)\n" +
                "Input a number and press enter...");
        System.out.println();
        int result = 0;
        do {
            System.out.println("1- Print student list\n"
                    + "2- Add student on the SIS \n"
                    + "3- Remove student on the SIS\n"
                    + "4- Find student on the SIS\n"
                    + "5- Sort student by id\n"
                    + "6- Exit");
            result = CONSOLE.nextInt();
            switch (result) {
                case 1:
                    printStudentList(studentMap);
                    break;
                case 2:
                    addStudent(studentMap);
                    break;
                case 3:
                    removeStudent(studentMap);
                    break;
                case 4:
                    findStudent(studentMap);
                    break;
                case 5:
                    sortStudent(studentMap);
                    break;
                case 6:
                    logOut();
                    break;
                default:
                    System.out.println("Wrong choose.");
            }
        } while (result != 6);
    }

    private static void sortStudent(Map<Integer, String> studentMap) {


        //  studentMap.entrySet().stream().sorted(comparingByKey()).collect(Collectors.toList());
        studentMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

    }


}
