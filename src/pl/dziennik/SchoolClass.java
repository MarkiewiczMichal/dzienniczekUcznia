package pl.dziennik;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    private final String name;
    private final List<Student> listOfStudentsInClass = new ArrayList<>();

    SchoolClass(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        listOfStudentsInClass.add(student);
    }

    public void removeStudentByName(Student student) {
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
                "Class name='" + name + '\'' +
                '}';
    }
}
