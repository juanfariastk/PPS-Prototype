package model;

public class Triangle extends Shape {
    public int base;
    public int height;

    public Triangle() {
    }

    public Triangle(Triangle source) {
        super(source);
        if (source != null) {
            this.base = source.base;
            this.height = source.height;
        }
    }

    @Override
    public Triangle getClone() {
        return new Triangle(this);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

