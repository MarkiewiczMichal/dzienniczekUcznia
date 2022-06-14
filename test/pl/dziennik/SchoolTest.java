package pl.dziennik;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    public void shouldSaythatIs6Classes(){
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

        assertEquals(6, primarySchool.getListOfSchoolClass().size());
    }


}