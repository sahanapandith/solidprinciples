package ocpviolation;

public class Rectangle {
    Double length;
    Double width;
    public Rectangle()
    {
        length=3.55;
        width=4.00;
    }
}
 class Circle {
    Double radius;
    public Circle()
    {
        radius=5.0;
    }
}

class OcpViolation{
    public static void main(String args[])
    {
        AreaCalculator objArea=new AreaCalculator();
        Rectangle objRec=new Rectangle();
        Circle objCir=new Circle();
        System.out.println( objArea.calculateRectangleArea(objRec));
        System.out.println( objArea.calculateCircleArea(objCir));
    }
}



