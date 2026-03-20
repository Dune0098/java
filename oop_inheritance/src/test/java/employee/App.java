package employee;

public class App {
    public static void main(String[] args) {
        Employee e[] = {new Developer("John", 1500, "java"),
                new Manager("Andrei", 3000, 2),
            new Employee("Luca", 1400)};

        for(Employee h : e){
            System.out.println(h.getDetails());
        }
    }
}
