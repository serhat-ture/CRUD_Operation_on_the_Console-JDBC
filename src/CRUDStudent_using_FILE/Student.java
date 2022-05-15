package CRUDStudent_using_FILE;

public class Student implements Comparable <Student> {

    private int id;
    private String name, gender;

    Student(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int compareTo(Student student)
    {
        if (id == student.id)
            return 0;
        else if (id > student.id)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", gender=" + gender + "]";
    }

}