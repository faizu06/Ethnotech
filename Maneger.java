package Employee;

public class Maneger extends Employee {
    int teamSize;

    public Maneger(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateBonus() { return salary * 0.20; }
}
