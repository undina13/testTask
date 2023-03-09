package repository;

import model.Department;
import model.Person;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private List<Department> departments = new ArrayList<>();
    private List<Person> people = new ArrayList<>();
    ;

    public List<Department> getDepartments() {
        return departments;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addPerson(Person person) {
        people.add(person);
    }
}
