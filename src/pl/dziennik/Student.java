package pl.dziennik;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Student {
    private final String name;
    private final String surname;
    private Map<SchoolSubject, List<SchoolGrade>> listOfGrades = new HashMap<>();


    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void addGrade(SchoolSubject schoolSubject, SchoolGrade grade) {
        List<SchoolGrade> temporaryListOfGrades = new ArrayList<>();

        if (listOfGrades.get(schoolSubject) != null) {
            temporaryListOfGrades.addAll(listOfGrades.get(schoolSubject));
        }
        temporaryListOfGrades.add(grade);
        listOfGrades.put(schoolSubject, temporaryListOfGrades);

    }

    public List<SchoolGrade> getListOfGrades(SchoolSubject schoolSubject) {
        return listOfGrades.get(schoolSubject);
    }

    public float averageOfGrades(SchoolSubject schoolSubject) {
        float average = 0;
        int numberOfGrades = 0;
        for (Map.Entry<SchoolSubject, List<SchoolGrade>> mapOfGrades : listOfGrades.entrySet()) {
            for (SchoolGrade grade : mapOfGrades.getValue()) {
                if (mapOfGrades.getKey() == schoolSubject) {
                    average += grade.getGrade();
                    numberOfGrades++;
                }
            }
        }
        return average / numberOfGrades;
    }

    public void getGradesOverPeriod(SchoolSubject schoolSubject, LocalDate start, LocalDate end) {

        for (Map.Entry<SchoolSubject, List<SchoolGrade>> mapOfGrades : listOfGrades.entrySet()) {
            if (mapOfGrades.getKey() == schoolSubject) {
                Stream<SchoolGrade> gradeStream = mapOfGrades.getValue().stream();
                gradeStream
                        .filter(g -> g.getDate().isAfter(start))
                        .filter(g -> g.getDate().isBefore(end))
                        .forEach(System.out::println);
            }
        }
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
