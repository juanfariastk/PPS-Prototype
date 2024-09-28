package model;

public abstract class Shape implements Prototype {
    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape source) {
        if (source != null) {
            this.x = source.x;
            this.y = source.y;
            this.color = source.color;
        }
    }

    public Prototype getClone() {
        return null;
    }

    public abstract void draw();
}

