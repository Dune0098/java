package employee;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public String getDetails(){
        return "Employee: " + name + ", " + salary + ", " + programmingLanguage;
    }
}
