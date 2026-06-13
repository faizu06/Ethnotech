package Employee;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new Maneger("Alice", 90000, 5),
                new Maneger("Faizan",80000,10),
                new Developer("Bob", 80000, "Java"),
                new Intern("Charlie", 30000, "MIT")
        };

        for (Employee emp : employees) {
            System.out.printf("%s: $%.0f%n", emp.name, emp.calculateBonus());
        }
    }
}