package Employee;

public class Intern extends Employee {
    String university;

    public Intern(String name, double salary, String university) {
        super(name, salary);
        this.university = university;
    }

    @Override
    public double calculateBonus() { return 0; }
}
