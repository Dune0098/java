package animals;

public class App {
    public static void main(String[] args) {
        Animal[] a = {new Animal("Drago"), new Cat("Momi"), new Dog("Red")};
        for(Animal i : a){
            System.out.println(i.makeSound());
        }
    }
}
