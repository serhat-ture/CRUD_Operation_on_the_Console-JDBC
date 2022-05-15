package CRUDStudent_using_JDBC;
/* in this project,
  the details of the students can be stored in a database with the use of this application.
  also,  the student information system is to allow the administrator to edit and find out details of a student.
  Used--->
  * Statement JDBC API Interface,
  * PostgreSQL create table, insert, update, etc. methods.*/

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

    static Connection connection = null;
    static Statement statement = null;

    public static void CreateTable() {

        Setup_Connection obj_ConnectDB = new Setup_Connection();
        connection = obj_ConnectDB.get_connection();

        try {
            String query = "create table students(sl_no SERIAL primary  key , firstname varchar (200),lastname varchar (200))";

            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("done");
        } catch (Exception e) {

        }
    }

    public static void AddStudent() {

        Setup_Connection obj_ConnectDB = new Setup_Connection();
        connection = obj_ConnectDB.get_connection();

        try {
            String INSERT_USERS_SQL = "insert into students" +
                    "  (firstname, lastname ) VALUES " +
                    " ('Serhat','Ture')";
            statement = connection.createStatement();
            statement.executeUpdate(INSERT_USERS_SQL);
            System.out.println("value inserted successfuly");
        } catch (Exception e) {

        }
    }

    public static void EditStudent() {

        Setup_Connection obj_ConnectDB = new Setup_Connection();
        connection = obj_ConnectDB.get_connection();

        try {
            String query = "update students set firstname ='Ali' where sl_no=1";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("value edted successfuly");
        } catch (Exception e) {

        }
    }

    public static void ReadStudentList() {

        Setup_Connection obj_ConnectDB = new Setup_Connection();
        connection = obj_ConnectDB.get_connection();
        ResultSet rs = null;

        try {
            String query = "select * from students";
            statement = connection.createStatement();
            rs = statement.executeQuery(query);

            while (rs.next()) {
                System.out.print(rs.getString("sl_no"));
                System.out.print(rs.getString(2));
                System.out.println(rs.getString(3));
            }
        } catch (Exception e) {

        }
    }

    public static void DeleteStudent() {

        Setup_Connection obj_ConnectDB = new Setup_Connection();
        connection = obj_ConnectDB.get_connection();

        try {
            String query = "delete  from  students where sl_no='1'";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("deleted");
        } catch (Exception e) {

        }
    }

    public static void SortStudent() {

        Setup_Connection obj_ConnectDB = new Setup_Connection();
        connection = obj_ConnectDB.get_connection();
        ResultSet rs = null;

        try {
            String query = "select * from students";
            statement = connection.createStatement();
            rs = statement.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getString(3));
                System.out.print(rs.getString(2));
                System.out.print(rs.getString("sl_no"));
            }

        } catch (Exception e) {

        }
    }


    public static void main(String[] args) {


        CreateTable();

        //      AddStudent();

        //      ReadStudentList();

        //      DeleteStudent();

        //    SortStudent();

        //    EditStudent();


    }
}
