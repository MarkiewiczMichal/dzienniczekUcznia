package pl.dziennik;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SchoolClassTest {

    @Test
    void addStudent() {
        //given
        SchoolClass sC = new SchoolClass("2b");

        //when
        var student = new Student("name", "surname");
        sC.addStudent(student);

        //then
        assertEquals(1, sC.getListOfStudentsInClass().size());
        assertEquals(student, sC.getListOfStudentsInClass().get(0));
    }

    @Test
    void removeStudentByName() {
        // given
        SchoolClass sc = new SchoolClass("1a");
        Student first = new Student("first", "student");
        Student second = new Student("second", "student");
        Student third = new Student("third", "student");

        //when
        sc.addStudent(first);
        sc.addStudent(second);
        sc.addStudent(third);

        //then
        assertEquals(3, sc.getListOfStudentsInClass().size());
        sc.removeStudentByName(first);
        assertEquals(2, sc.getListOfStudentsInClass().size());
        assertFalse( sc.getListOfStudentsInClass().contains(first));
    }

    @Test
    void getListOfStudentsInClass() {
        // given
        SchoolClass sc = new SchoolClass("1a");
        Student first = new Student("first", "student");
        Student second = new Student("second", "student");
        Student third = new Student("third", "student");

        //when
        sc.addStudent(first);
        sc.addStudent(second);
        sc.addStudent(third);

        //then
        assertEquals(3, sc.getListOfStudentsInClass().size());
    }
}