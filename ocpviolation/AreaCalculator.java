package ocpviolation;

public class AreaCalculator {
    public Double calculateRectangleArea(Rectangle rectangle) {

        return rectangle.length * rectangle.width;
    }

    public Double calculateCircleArea(Circle cir) {
        return (3.14) * cir.radius * cir.radius;
    }
}
