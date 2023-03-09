package controller;

import model.Department;
import model.Person;
import repository.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Controller {
    private Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    public Map<Integer, Person> getMaxSalaryByDepartment() {
        Comparator<Person> comparator = Comparator.comparingInt(Person::getSalaryInt);
        return repository.getPeople().stream()
                .collect(Collectors.toMap(Person::getDepartmentId, Function.identity(),
                        BinaryOperator.maxBy(comparator)));
    }

    public void printMaxSalary() {
        Map<Integer, Person> personMap = getMaxSalaryByDepartment();
        List<Department> departments = repository.getDepartments();
        for (int i = 0; i < departments.size(); i++) {
            Department department = departments.get(i);

            System.out.print(department.getDepartmentName() + " - " + personMap.get(department.getDepartmentId())
                    .getSalary());
            if (i != departments.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}

