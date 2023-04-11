package abstract_class_practice;

public abstract class Shape {
    public abstract double computeArea();
}

class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double computeArea() {
        return width * length;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return radius * radius * Math.PI;
    }
}

class Main {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(10.0, 20.0);
        double area1 = shape1.computeArea();
        System.out.println(area1);

        Shape shape2 = new Circle(3.0);
        double area2 = shape2.computeArea();
        System.out.println(area2);
    }
}
