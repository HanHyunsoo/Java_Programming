package chapter5;

public class No13 {
    public static void main(String[] args) {
        Shape donut = new Circle(10);
        donut.redraw();
        System.out.println("면적은 " + donut.getArea());
    }
}

interface Shape {
    double PI = 3.14;
    void draw();
    double getArea();
    default void redraw() {
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}

class Circle implements Shape {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("반지름이 " + r + "인 원입니다.");
    }

    @Override
    public double getArea() {
        return PI * r * r;
    }
}