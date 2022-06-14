package pl.dziennik;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SchoolClassTest {

    @Test
    void addStudent() {
        //given
        SchoolClass sC = new SchoolClass("2b");

        //when
        sC.addStudent(new Student("name", "surname"));

        //then
        assertEquals(1, sC.getListOfStudentsInClass().size());
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
        assertEquals(3,sc.getListOfStudentsInClass().size());
        sc.removeStudentByName(first);
        assertEquals(2,sc.getListOfStudentsInClass().size());
    }

    @Test
    void getListOfStudentsInClass() {
    }
}