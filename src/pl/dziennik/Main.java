package pl.dziennik;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        School primarySchool = new School();
        SchoolClass class1a = new SchoolClass("1a");
        SchoolClass class1b = new SchoolClass("1b");
        SchoolClass class1c = new SchoolClass("1c");
        SchoolClass class2a = new SchoolClass("2a");
        SchoolClass class2b = new SchoolClass("2b");
        SchoolClass class2c = new SchoolClass("2c");

        primarySchool.addNewSchoolClass(class1a);
        primarySchool.addNewSchoolClass(class1b);
        primarySchool.addNewSchoolClass(class1c);
        primarySchool.addNewSchoolClass(class2a);
        primarySchool.addNewSchoolClass(class2b);
        primarySchool.addNewSchoolClass(class2c);

        Student sonia = new Student("Sonia", "Nowicka");
        Student krzys = new Student("Krzysztof", "Krzeminski");
        Student wiktoria = new Student("Wiktoria", "Kozlowska");
        Student kamila = new Student("Kamila", "Dąbrowska");
        Student maria = new Student("Maria", "Mazur");
        Student maja = new Student("Maja", "Kołodziejczyk");
        Student pawel = new Student("Paweł", "Michalik");
        Student oliwia = new Student("Oliwia", "Dąbrowska");
        Student bartek = new Student("Bartek", "Lewandowski");

        class1a.addStudent(sonia);
        class1a.addStudent(krzys);
        class1a.addStudent(wiktoria);
        class1b.addStudent(kamila);
        class1b.addStudent(maria);
        class1b.addStudent(maja);
        class1c.addStudent(pawel);
        class1c.addStudent(oliwia);
        class1c.addStudent(bartek);


        System.out.println("--------");
        System.out.println("Schow list of school class:");
        System.out.println(primarySchool.getListOfSchoolClass());

        System.out.println("--------");
        System.out.println("Schow list of student in class 1a:");
        System.out.println(class1a.getListOfStudentsInClass());

        SchoolGrade sixMark = new SchoolGrade(6, LocalDate.of(2022, 6, 9));
        SchoolGrade fiveMark = new SchoolGrade(5, LocalDate.of(2022, 6, 9));

        sonia.addGrade(SchoolSubject.MATH, sixMark);
        sonia.addGrade(SchoolSubject.MATH, fiveMark);

        System.out.println("--------");
        System.out.println("Sonia gets two grades in math");
        System.out.println(sonia.getListOfGrades(SchoolSubject.MATH));

        System.out.println("--------");
        System.out.println("Sonia get one grade in physics");
        SchoolGrade oneMark = new SchoolGrade(1, LocalDate.of(2020, 11, 9));
        sonia.addGrade(SchoolSubject.PHYSICS, oneMark);


        System.out.println("--------");
        System.out.println("Sonia still have two grades in math");
        System.out.println(sonia.getListOfGrades(SchoolSubject.MATH));

        System.out.println("--------");
        System.out.println("Sonia have one grade in physics");
        System.out.println(sonia.getListOfGrades(SchoolSubject.PHYSICS));

        sonia.addGrade(SchoolSubject.MATH, oneMark);

        System.out.println("--------");
        System.out.println("Sonia get third grade in math");
        System.out.println(sonia.getListOfGrades(SchoolSubject.MATH));


        System.out.println("--------");
        System.out.println("Show sonias grades in math");
        System.out.println(sonia.getListOfGrades(SchoolSubject.MATH));
        System.out.println("Show average grades in math");
        System.out.println(sonia.averagePerGrades(SchoolSubject.MATH));

        System.out.println("--------");
        System.out.println("Show sonias grade in math from 2020-01-01 to 2021-01-01");
        System.out.println(
                sonia.getGradesOverPeriod(SchoolSubject.MATH, LocalDate.of(2020, 1, 1), LocalDate.of(2021, 1, 1))
        );
        System.out.println(class1a.getListOfStudentsInClass());
        class1a.removeStudentByName(sonia);
        System.out.println(class1a.getListOfStudentsInClass());
        class1a.addStudent(sonia);
        System.out.println(class1a.getListOfStudentsInClass());
        class1a.removeStudentByName(sonia);
        System.out.println(class1a.getListOfStudentsInClass());
    }
}
