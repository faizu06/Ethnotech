package Employee;

public class Developer extends Employee {
    String language;

    public Developer(String name, double salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    public double calculateBonus() { return salary * 0.15; }
}
