package model;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle source) {
        super(source);
        if (source != null) {
            this.width = source.width;
            this.height = source.height;
        }
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

