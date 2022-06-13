package pl.dziennik;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<SchoolClass> schoolClasses = new ArrayList<>();


    public void addNewSchoolClass(SchoolClass name) {
        schoolClasses.add(name);
    }

    public List<SchoolClass> getListOfSchoolClass() {
        return schoolClasses;
    }
}
