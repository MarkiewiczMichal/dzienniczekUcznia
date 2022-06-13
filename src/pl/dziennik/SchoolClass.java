package pl.dziennik;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    private final String nameOfschoolClass;
    private final List<Student> listOfStudentsInClass = new ArrayList<>();

    SchoolClass(String nameOfschoolClass) {
        this.nameOfschoolClass = nameOfschoolClass;
    }

    public void addStudentToschoolClass(Student student) {
        listOfStudentsInClass.add(student);
    }

    public List<Student> getListOfStudentsInClass() {
        return listOfStudentsInClass;
    }

    @Override
    public String toString() {
        return "{" +
                "Class name='" + nameOfschoolClass + '\'' +
                '}';
    }
}
