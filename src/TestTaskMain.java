import controller.Controller;
import model.Address;
import model.Department;
import model.Person;
import repository.Repository;

public class TestTaskMain {
    public static void main(String[] args) {
        Repository repository = new Repository();
        repository.addDepartment(new Department(1, "Java"));
        repository.addDepartment(new Department(2, "C#"));
        repository.addDepartment(new Department(3, "JavaScript"));

        repository.addPerson(new Person(1, "Raman", "1000", 1,
                new Address("Brest", "YK", 17)));

        repository.addPerson(new Person(2, "Anha", "2500", 1,
                new Address("Brest", "RS", 11)));
        repository.addPerson(new Person(3, "Artem", "1500", 2,
                new Address("Wroclaw", "lenina", 1)));
        repository.addPerson(new Person(4, "Alex", "1700", 2,
                new Address("Minsk", "Ordj", 29)));
        repository.addPerson(new Person(5, "Ivan", "3000", 3,
                new Address("Wroclaw", "lenina", 1)));

        Controller controller = new Controller(repository);
        controller.printMaxSalary();
    }
}
