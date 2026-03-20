package employee;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    @Override
    public String getDetails(){
        return "Employee: " + name + ", " + salary + ", " + teamSize;
    }
}
