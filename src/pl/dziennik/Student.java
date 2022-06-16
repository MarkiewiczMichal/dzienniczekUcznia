package pl.dziennik;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Student {
    private final String name;
    private final String surname;
    private Map<SchoolSubject, List<SchoolGrade>> mapOfGrades = new HashMap<>();


    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void addGrade(SchoolSubject schoolSubject, SchoolGrade grade) {
        List<SchoolGrade> temporaryListOfGrades = new ArrayList<>();

        if (mapOfGrades.get(schoolSubject) != null) {
            temporaryListOfGrades.addAll(mapOfGrades.get(schoolSubject));
        }
        temporaryListOfGrades.add(grade);
        mapOfGrades.put(schoolSubject, temporaryListOfGrades);

    }

    public List<SchoolGrade> getListOfGrades(SchoolSubject schoolSubject) {
        return mapOfGrades.get(schoolSubject);
    }

    public float averagePerGrades(SchoolSubject schoolSubject) {
        float average = 0;
        int numberOfGrades = 0;
        if (mapOfGrades.get(schoolSubject) == null) return 0;
        for (SchoolGrade grade : mapOfGrades.get(schoolSubject)) {
            average += grade.getGrade();
            numberOfGrades++;
        }
        return average / numberOfGrades;
    }

    public List<SchoolGrade> getGradesOverPeriod(SchoolSubject schoolSubject, LocalDate start, LocalDate end) {
        List<SchoolGrade> tempGradelist = new ArrayList<>();

        for (Map.Entry<SchoolSubject, List<SchoolGrade>> mapOfGrades : mapOfGrades.entrySet()) {
            if (mapOfGrades.getKey() == schoolSubject) {
                Stream<SchoolGrade> gradeStream = mapOfGrades.getValue().stream();
                tempGradelist = gradeStream
                        .filter(g -> !g.getDate().isBefore(start))
                        .filter(g -> !g.getDate().isAfter(end))
                        .toList();
            }
        }
        return tempGradelist;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
