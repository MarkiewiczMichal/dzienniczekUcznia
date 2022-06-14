package pl.dziennik;

import java.util.ArrayList;
import java.util.Iterator;
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

    public void removeStudentFromSchoolClass(Student student) {
//        Iterator<Student> it = listOfStudentsInClass.iterator();
//        while (it.hasNext()){
//            if(it.next()==student){
//                it.remove();
//            }
        listOfStudentsInClass.removeIf(x -> x == student);
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
