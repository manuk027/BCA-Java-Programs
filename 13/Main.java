import java.util.Scanner;

abstract class Shape {
  protected double dimension1;
  protected double dimension2;
  public Shape(double dimension1, double dimension2) {
    this.dimension1 = dimension1;
    this.dimension2 = dimension2;
  }
  public abstract double area();
}

class Rectangle extends Shape {
  public Rectangle(double length, double width) {
    super(length, width);
  }
  public double area() {
    return dimension1 * dimension2;
  }
}

class Triangle extends Shape {
  public Triangle(double base, double height) {
    super(base, height);
  }
  public double area() {
    return 0.5 * dimension1 * dimension2;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter dimensions for the Rectangle (length and width):");
    double rectLength = scanner.nextDouble();
    double rectWidth = scanner.nextDouble();
    Rectangle rectangle = new Rectangle(rectLength, rectWidth);
    System.out.println("Enter dimensions for the Triangle (base and height):");
    double triBase = scanner.nextDouble();
    double triHeight = scanner.nextDouble();
    Triangle triangle = new Triangle(triBase, triHeight);
    scanner.close();
    System.out.println("Area of Rectangle: " + rectangle.area());
    System.out.println("Area of Triangle: " + triangle.area());
  }
}
