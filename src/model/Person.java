package model;

public class Person {
    int id;
    String name;
    String salary;
    int departmentId;
    Address address;

    public Person(int id, String name, String salary, int departmentId, Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departmentId = departmentId;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public Address getAddress() {
        return address;
    }

    public int getSalaryInt() {
        return Integer.parseInt(salary);
    }
}
