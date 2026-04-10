package shapes;

public class App {

    public static void main(String[] args) {

        Shape[] s = {new Shape("Blu"), new Rectangle("Green", 5 , 2),
                new Circle("Yellow", 4)};
        for(Shape i : s){
            System.out.println(i.color);
            System.out.println(i.getArea());
            System.out.println(i.getDescription());
        }
    }
}
