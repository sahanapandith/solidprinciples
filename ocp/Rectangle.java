package ocp;

public class Rectangle implements Shape {
    Double length = 7.5;
    Double width = 6.0;

    public Double calculateArea() {
        return length * width;
    }
}
