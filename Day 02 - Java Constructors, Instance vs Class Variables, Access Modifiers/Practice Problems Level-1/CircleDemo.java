package Day2.PracticeProblemsLevel_1;
class Circle {
    private double radius;
    public Circle() {
        this(1.0);
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public void displayRadius() {
        System.out.println("Circle Radius: " + radius);
    }
}
public class CircleDemo {
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        defaultCircle.displayRadius();
        Circle customCircle = new Circle(5.5);
        customCircle.displayRadius();
    }
}
