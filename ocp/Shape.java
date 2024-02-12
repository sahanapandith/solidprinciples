package ocp;

public interface Shape {
    Double calculateArea();
}

class Circle implements Shape {
    Double radius=6.5;
    public Double calculateArea() {
        return (3.14) * radius * radius;
    }
}

class Ocp{
    public static void main(String args[])
    {
        //AreaCalculator objArea=new AreaCalculator();
        Rectangle objRec=new Rectangle();
        Circle objCir=new Circle();
        System.out.println( objRec.calculateArea());
        System.out.println( objCir.calculateArea());
    }
}


