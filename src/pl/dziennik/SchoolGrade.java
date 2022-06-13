package pl.dziennik;

import java.time.LocalDate;

public class SchoolGrade {
    private final int grade;
    public final LocalDate dateOfGrade;

    SchoolGrade(int grade, LocalDate dateOfGrade) {
        this.grade = grade;
        this.dateOfGrade = dateOfGrade;
    }

        public int getGrade() {
        return grade;
    }

    public LocalDate getDate() {
        return dateOfGrade;
    }

    @Override
    public String toString() {
        return "{" +
                "grade=" + grade +
                ", date=" + dateOfGrade +
                '}';
    }
}
