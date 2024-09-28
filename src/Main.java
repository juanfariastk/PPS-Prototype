import model.*;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 5;
        rectangle.y = 10;
        rectangle.width = 20;
        rectangle.height = 30;
        rectangle.color = "blue";

        Triangle triangle = new Triangle();
        triangle.x = 1;
        triangle.y = 2;
        triangle.base = 10;
        triangle.height = 15;
        triangle.color = "green";


        Circle clonedCircle = circle.getClone();
        Rectangle clonedRectangle = rectangle.getClone();
        Triangle clonedTriangle = triangle.getClone();


        System.out.println("Original objects:");
        circle.draw();
        rectangle.draw();
        triangle.draw();

        System.out.println("\nCloned objects:");
        clonedCircle.draw();
        clonedRectangle.draw();
        clonedTriangle.draw();
    }
}
