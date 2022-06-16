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
        noName.addGrade(SchoolSubject.MATH, new SchoolGrade(5, LocalDate.of(2021, 10, 11)));

        //then
        assertEquals(5, (noName.getListOfGrades(SchoolSubject.MATH))
                .get(0)
                .getGrade());
    }

    @Test
    void getListOfGrades() {
        //given
        Student noName = new Student("no", "name");

        //when
        noName.addGrade(SchoolSubject.MATH, new SchoolGrade(5, LocalDate.of(2021, 10, 11)));
        noName.addGrade(SchoolSubject.MATH, new SchoolGrade(5, LocalDate.of(2021, 10, 11)));
        noName.addGrade(SchoolSubject.MATH, new SchoolGrade(5, LocalDate.of(2021, 10, 11)));
        noName.addGrade(SchoolSubject.MATH, new SchoolGrade(5, LocalDate.of(2021, 10, 11)));

        //then
        assertEquals(4, noName.getListOfGrades(SchoolSubject.MATH).size());
    }

    @Test
    void averagePerGrades() {
        //given
        Student noName = new Student("no", "name");

        //when
        noName.addGrade(SchoolSubject.MATH, new SchoolGrade(5, LocalDate.now()));
        noName.addGrade(SchoolSubject.MATH, new SchoolGrade(3, LocalDate.now()));
        noName.addGrade(SchoolSubject.MATH, new SchoolGrade(3, LocalDate.now()));
        noName.addGrade(SchoolSubject.BIOLOGY, new SchoolGrade(3, LocalDate.now()));

        //then
        assertEquals((float) 11 / 3, noName.averagePerGrades(SchoolSubject.MATH));

    }

    @Test
    void getGradesOverPeriod() {
        //given
        Student noName = new Student("no", "name");

        //when
        noName.addGrade(SchoolSubject.MATH, new SchoolGrade(5, LocalDate.of(2020, 10, 1)));
        noName.addGrade(SchoolSubject.MATH, new SchoolGrade(4, LocalDate.of(2022, 1, 30)));
        noName.addGrade(SchoolSubject.MATH, new SchoolGrade(3, LocalDate.of(2021, 3, 12)));
        noName.addGrade(SchoolSubject.MATH, new SchoolGrade(2, LocalDate.of(2023, 9, 5)));

        //then
        assertEquals(1, noName.getGradesOverPeriod(SchoolSubject.MATH,
                LocalDate.of(2020, 1, 1),
                LocalDate.of(2021, 1, 1)).size());

    }
}