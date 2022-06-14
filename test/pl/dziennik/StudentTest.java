package pl.dziennik;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void addGrade() {
        //given
        Student noName = new Student("no", "name");

        //when
        noName.addGrade(SchoolSubject.MATH, new SchoolGrade(5, LocalDate.now()));

        //then
        assertEquals(5, (noName.getListOfGrades(SchoolSubject.MATH))
                .get(0)
                .getGrade());

    }

    @Test
    void getListOfGrades() {
    }

    @Test
    void averageOfGrades() {
        //given
        Student noName = new Student("no", "name");

        //when
        noName.addGrade(SchoolSubject.MATH, new SchoolGrade(5, LocalDate.now()));
        noName.addGrade(SchoolSubject.MATH, new SchoolGrade(3, LocalDate.now()));
        noName.addGrade(SchoolSubject.MATH, new SchoolGrade(3, LocalDate.now()));

        //then
        assertEquals((float)11/3,noName.averageOfGrades(SchoolSubject.MATH));

    }

    @Test
    void getGradesOverPeriod() {
        //given
        Student noName = new Student("no", "name");

        //when
        noName.addGrade(SchoolSubject.MATH, new SchoolGrade(5, LocalDate.of(2020,10,1)));
        noName.addGrade(SchoolSubject.MATH, new SchoolGrade(4, LocalDate.of(2022,1,30)));
        noName.addGrade(SchoolSubject.MATH, new SchoolGrade(3, LocalDate.of(2021,3,12)));
        noName.addGrade(SchoolSubject.MATH, new SchoolGrade(2, LocalDate.of(2023,9,5)));

        //then
        // tego się nie da przetestować bo metoda nie zwraca nic, tylko wyświetla

    }

    @Test
    void getName() {
        //given
        Student noName;

        //when
        noName = new Student("no", "name");

        //then
        assertEquals("no", noName.getName());
    }

    @Test
    void getSurname() {
        //given
        Student noName;

        //when
        noName = new Student("no", "name");

        //then
        assertEquals("name", noName.getSurname());
    }
}