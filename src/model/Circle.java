package model;

public class Circle extends Shape {
    public int radius;

    public Circle() {
    }

    public Circle(Circle source) {
        super(source);
        if (source != null) {
            this.radius = source.radius;
        }
    }

    @Override
    public Circle getClone() {
        return new Circle(this);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

